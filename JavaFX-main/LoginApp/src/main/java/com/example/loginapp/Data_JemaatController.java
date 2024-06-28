package com.example.loginapp;

import com.example.loginapp.classes.Data_Jemaat;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.*;
import java.util.Optional;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;


public class Data_JemaatController {

    @FXML
    private Button deleteJemaatBtn;

    @FXML
    private Button editJemaatBtn;

    @FXML
    private TableView<Data_Jemaat> table;

    @FXML
    private TableColumn<Data_Jemaat, String> table_alamat;

    @FXML
    private TableColumn<Data_Jemaat, String> table_kontak_ortu;

    @FXML
    private TableColumn<Data_Jemaat, String> table_member;

    @FXML
    private TableColumn<Data_Jemaat, String> table_nama;

    @FXML
    private TableColumn<Data_Jemaat, Integer> table_nij;

    @FXML
    private TableColumn<Data_Jemaat, String> table_no_tlp;

    @FXML
    private TableColumn<Data_Jemaat, Date> table_tanggal_lahir;

    @FXML
    private TableColumn<Data_Jemaat, String> table_tempat_lahir;

    @FXML
    private Button tambahJemaatBtn;
    private Stage stage;

    @FXML
    void handleTambahJemaatBtn(ActionEvent event) {

    }

    Connection con;
    PreparedStatement st;
    ResultSet rs;

    @FXML
    public void initialize() throws SQLException {
        showData();

        // Add a listener for double-clicks on table rows
//        table.setRowFactory(tv -> {
//            TableRow<TahunAjaran> row = new TableRow<>();
//            row.setOnMouseClicked(event -> {
//                if (event.getClickCount() == 2 && (!row.isEmpty())) {
//                    TahunAjaran rowData = row.getItem();
//                    if (rowData != null) {
//                        dataSekolahMingguController.setId_tahun_ajaran(rowData.getId_tahun_ajaran());
//                        try {
//                            dataSekolahMingguController.updateKelasDropDownMenu();
//                        } catch (SQLException e) {
//                            throw new RuntimeException(e);
//                        }
//                        dataSekolahMingguController.getTahunAjaranStage().close();
//                    }
//                }
//            });
//            return row;
//        });
    }

    public void tombol() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Input Jemaat");
        dialog.setHeaderText(null);
        dialog.setContentText("Jemaat:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(tahunAjaran -> {
            System.out.println("Jemaat: " + tahunAjaran);
            // TODO add try-catch for invalid tahunAjaran input
        });
    }

    public void showData() throws SQLException {
        ObservableList<Data_Jemaat> list = getDataJemaat();
        table.setItems(list);
        table_nij.setCellValueFactory(new PropertyValueFactory<Data_Jemaat, Integer>("nij"));
        table_nama.setCellValueFactory(new PropertyValueFactory<Data_Jemaat, String>("nama"));
        table_tempat_lahir.setCellValueFactory(new PropertyValueFactory<Data_Jemaat, String>("tempat_lahir"));
        table_tanggal_lahir.setCellValueFactory(new PropertyValueFactory<Data_Jemaat, Date>("tanggal_lahir"));
        table_alamat.setCellValueFactory(new PropertyValueFactory<Data_Jemaat, String>("alamat"));
        table_no_tlp.setCellValueFactory(new PropertyValueFactory<Data_Jemaat, String>("no_tlp"));
        table_kontak_ortu.setCellValueFactory(new PropertyValueFactory<Data_Jemaat, String>("kontak_ortu"));
        table_member.setCellValueFactory(new PropertyValueFactory<Data_Jemaat, String>("member_perpustakaan_yon"));
    }

    public ObservableList<Data_Jemaat> getDataJemaat() throws SQLException {
        ObservableList<Data_Jemaat> listOfDataJemaat = FXCollections.observableArrayList();
        String query = "SELECT * FROM data_jemaat";
        con = DatabaseConnection.getConnection();
        st = con.prepareStatement(query);
        rs = st.executeQuery();
        while (rs.next()) {
            Data_Jemaat data_jemaat = new Data_Jemaat(rs.getInt("nij"), rs.getString("nama"),rs.getString("tempat_lahir"),rs.getDate("tanggal_lahir"),rs.getString("alamat"),rs.getString("no_tlp"),rs.getString("kontak_ortu"),rs.getString("member_perpustakaan_yon"));
            listOfDataJemaat.add(data_jemaat);
        }
        return listOfDataJemaat;
    }
    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
