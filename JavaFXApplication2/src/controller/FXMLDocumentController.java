/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Cimol
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Button btnRengar;

    @FXML
    private Button btnNunu;

    @FXML
    private Button btnZoe;

    @FXML
    private Button btnYasuo;

    @FXML
    private Button btnCassiopeia;

    @FXML
    private Button btnRenekton;

    @FXML
    private Button btnLulu;

    @FXML
    private Button btnKalista;

    @FXML
    private Button btnMaokai;

    @FXML
    private Button btnDraven;

    @FXML
    private Button btnHeimer;

    @FXML
    private Button btnPantheon;

    @FXML
    private Button btnJarvanIV;

    @FXML
    private Button btnIrelia;

    @FXML
    private Button btnKassadin;

    @FXML
    private Button btnOrnn;

    @FXML
    private Button btnJhin;

    @FXML
    private Button btnDiana;

    @FXML
    private Button btnMalphite;

    @FXML
    private Button btnTryndamere;

    @FXML
    private Button btnMorgana;

    @FXML
    private Button btnKayn;

    @FXML
    private Button btnMordekaiser;

    @FXML
    private Button btnAatrox;

    @FXML
    private Button btnBlitz;

    @FXML
    private Button btnZilean;

    @FXML
    private Button btnYorick;

    @FXML
    private Button btnKayle;

    @FXML
    private Button btnFiddle;

    @FXML
    private Button btnGalio;

    @FXML
    private Button btnVarus;

    @FXML
    private Button btnUdyr;

    @FXML
    private Button btnSinged;

    @FXML
    private Button btnQiyana;

    @FXML
    private Button btnDarius;

    @FXML
    private Button btnKogMaw;

    @FXML
    private Button btnAmumu;

    @FXML
    private Button btnWukong;

    @FXML
    private Button btnAkali;

    @FXML
    private Button btnLeeSin;

    @FXML
    private Button btnKindred;

    @FXML
    private Button btnNautilus;

    @FXML
    private Button btnElise;

    @FXML
    private Button btnEkko;

    @FXML
    private Button btnSejuani;

    @FXML
    private Button btnRekSai;

    @FXML
    private Button btnNami;

    @FXML
    private Button btnZed;

    @FXML
    private Button btnVayne;

    @FXML
    private Button btnGraves;

    @FXML
    private Button btnMalzahar;

    @FXML
    private Button btnAhri;

    @FXML
    private Button btnViktor;

    @FXML
    private Button btnLeblanc;

    @FXML
    private Button btnYuumi;

    @FXML
    private Button btnSwain;

    @FXML
    private Button btnRyze;

    @FXML
    private Button btnZyra;

    @FXML
    private Button btnZiggs;

    @FXML
    private Button btnAshe;

    @FXML
    private Button btnAlistar;

    @FXML
    private Button btnIvern;

    @FXML
    private Button btnTaliyah;

    @FXML
    private Button btnShen;

    @FXML
    private Button btnTwitch;

    @FXML
    private Button btnTrundle;

    @FXML
    private Button btnJayce;

    @FXML
    private Button btnJanna;

    @FXML
    private Button btnNasus;

    @FXML
    private Button btnOlaf;

    @FXML
    private Button btnXinZhao;

    @FXML
    private Button btnCorki;

    @FXML
    private Button btnSylas;

    @FXML
    private Button btnFiora;

    @FXML
    private Button btnNidalee;

    @FXML
    private Button btnKled;

    @FXML
    private Button btnCaitlyn;

    @FXML
    private Button btnGragas;

    @FXML
    private Button btnTahmKench;

    @FXML
    private Button btnSion;

    @FXML
    private Button btnAnivia;

    @FXML
    private Button btnBraum;

    @FXML
    private Button btnSoraka;

    @FXML
    private Button btnJinx;

    @FXML
    private Button btnHecarim;

    @FXML
    private Button btnWarwick;

    @FXML
    private Button btnKatarina;

    @FXML
    private Button btnKhazix;

    @FXML
    private Button btnTaric;

    @FXML
    private Button btnMasterYi;

    @FXML
    private Button btnGnar;

    @FXML
    private Button btnVladimir;

    @FXML
    private Button btnBrand;

    @FXML
    private Button btnChogath;

    @FXML
    private Button btnXayah;

    @FXML
    private Button btnEzreal;

    @FXML
    private Button btnRakan;

    @FXML
    private Button btnKarthus;

    @FXML
    private Button btnQuinn;

    @FXML
    private Button btnTeemo;

    @FXML
    private Button btnVi;

    @FXML
    private Button btnRumble;

    @FXML
    private Button btnNocturne;

    @FXML
    private Button btnGangplank;

    @FXML
    private Button btnShyvana;

    @FXML
    private Button btnAurelionSol;

    @FXML
    private Button btnSona;

    @FXML
    private Button btnNeeko;

    @FXML
    private Button btnLux;

    @FXML
    private Button btnAnnie;

    @FXML
    private Button btnTwistedFate;

    @FXML
    private Button btnPoppy;

    @FXML
    private Button btnTalon;

    @FXML
    private Button btnUrgot;

    @FXML
    private Button btnVeigar;

    @FXML
    private Button btnVolibear;

    @FXML
    private Button btnLeona;

    @FXML
    private Button btnGaren;

    @FXML
    private Button btnPyke;

    @FXML
    private Button btnThresh;

    @FXML
    private Button btnTristana;

    @FXML
    private Button btnKennen;

    @FXML
    private Button btnXerath;

    @FXML
    private Button btnLissandra;

    @FXML
    private Button btnAzir;

    @FXML
    private Button btnSkarner;

    @FXML
    private Button btnSyndra;

    @FXML
    private Button btnShaco;

    @FXML
    private Button btnOrianna;

    @FXML
    private Button btnDrMundo;

    @FXML
    private Button btnBardo;

    @FXML
    private Button btnEvelynn;

    @FXML
    private Button btnKaisa;

    @FXML
    private Button btnMissFortune;

    @FXML
    private Button btnLucian;

    @FXML
    private Button btnSenna;

    @FXML
    private Button btnIllaoi;

    @FXML
    private Button btnZac;

    @FXML
    private Button btnSivir;

    @FXML
    private Button btnJax;

    @FXML
    private Button btnRammus;

    @FXML
    private Button btnCamille;

    @FXML
    private Button btnFizz;

    @FXML
    private Button btnRiven;

    @FXML
    private Button btnKarma;

    @FXML
    private Button btnVelkoz;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         Image aatrox = new Image(getClass().getResourceAsStream("/images/Aatrox.png"));
         btnAatrox.setGraphic(new ImageView(aatrox)); 
         Image ahri = new Image(getClass().getResourceAsStream("/images/Ahri.png"));
         btnAhri.setGraphic(new ImageView(ahri));
    }    
    
}
