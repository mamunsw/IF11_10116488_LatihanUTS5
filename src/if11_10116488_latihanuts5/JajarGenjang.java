/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if11_10116488_latihanuts5;

/**
 *
 * @author MSW98
 */
public class JajarGenjang implements BangunDatar {
int luas;
int keliling;
final int sisiAb=50;
final int sisiBc=60;
final int sisiCd=70;
final int sisiDa=80;
int alas=100;
int tinggi=120;
    

    
    @Override
    public void hitungLuas() {
        luas=alas*tinggi;
        
        System.out.println("Luas Jajar genjang : "+luas);
        }

    @Override
    public void hitungKeliling() {
        keliling=sisiAb+sisiBc+sisiCd+sisiDa;
        
        System.out.println("Keliling Jajar Genjang : "+keliling);
        }
    
    
}
