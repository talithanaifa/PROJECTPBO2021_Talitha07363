package asistensi3_07363;

import Gui_07363.MenuGui_07363;
import controller_07363.adminController_07363;
import controller_07363.pembeliController_07363;
import controller_07363.transaksiController_07363;
import entity_07363.pembeliEntity_07363;
import entity_07363.produkEntity_07363;
import entity_07363.transaksiEntity_07363;
import java.util.Scanner;

public class Asistensi3_07363 {
    private static Scanner scan = new Scanner(System.in);
    public static adminController_07363 admin= new adminController_07363();
    public static pembeliController_07363 pembeli= new pembeliController_07363();
    public static transaksiController_07363 transaksi= new transaksiController_07363();
    public static void main(String[] args){
        new MenuGui_07363();
    } 
}