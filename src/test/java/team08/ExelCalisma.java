package team08;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;
import utilities.TestBaseBeforeAfter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExelCalisma extends TestBaseBeforeAfter {

    @Test
    public void test1() throws IOException {

        //ODEV
        //Yeni bir test method olusturalim readExcel2()

      String  dosyaYolu="src/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);
        //-1.satirdaki 2.hucreye gidelim v eyazdiralim
        workbook.getSheet("Sayfa1").getRow(0).getCell(1).toString();

        //-1.satirdaki 2.hucreyi bir string degiskene atayalim veyazdiralim
        String yaz= workbook.getSheet("Sayfa1").getRow(0).getCell(1).toString();

        //-2.satir 4.cell’in afganistan’in baskenti oldugunu testedelim
      String actualBaskent=  workbook.getSheet("Sayfa1").getRow(1).getCell(3).toString();
      String expactedResult="Kabil";
        Assert.assertEquals(expactedResult,actualBaskent);

        //-Satir sayisinibulalim
        int satirSayisi=workbook.getSheet("Sayfa1").getLastRowNum();
        System.out.println(satirSayisi+1);

        //-Fiziki olarak kullanilan satir sayisinibulun
       int kullanilanSatir= workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        System.out.println(kullanilanSatir);

        //-Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim





    }
}
