package day14;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C04ReadExel {



    @Test
    public void readExelTest1() throws IOException {



        //-Dosya yolunu bir String degiskene atayalim
        //-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        //-Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        //-WorkbookFactory.create(fileInputStream)
        String dosyaYolu="C:\\Users\\samsung\\Downloads\\ulkeler.xlsx";

        FileInputStream fis=new FileInputStream(dosyaYolu); //Oluşturduğumuz dosyayı sisteme alır.

        Workbook workbook= WorkbookFactory.create(fis);

        //-Turkce baskentler sutununu yazdiralim
        int sonSatir= workbook.getSheet("Sayfa1").getLastRowNum();
        //getLastRowNum() methodu bize exel sayfasındaki tüm satir nuumarasını verir


        System.out.println("Satir sayisi"+sonSatir);
        String turkceBaskentler="";
        for (int i = 0; i <= sonSatir; i++) {
            turkceBaskentler=workbook.getSheet("sayfa1").getRow(i).getCell(3).toString();
            System.out.println(turkceBaskentler);
        }

        }



}
