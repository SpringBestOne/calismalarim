package day14;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ReadExel{

    @Test
        public void readExelTest1() throws IOException {

            //// belirtilen satir no ve sutun no degerlerini parametre olarak alip
            //// o cell'deki datayi konsola yazdirin
            //// sonra sonucun konsolda yazanla ayni oldugunu dogrulayin


            int satir=12;
            int sutun = 2;

            String dosyaYolu="C:\\Users\\samsung\\Downloads\\ulkeler.xlsx";

            FileInputStream fis=new FileInputStream(dosyaYolu); //Oluşturduğumuz dosyayı sisteme alır.

            Workbook workbook= WorkbookFactory.create(fis);

            String actualData=workbook.
                    getSheet("Sayfa1").
                getRow(satir-1).
                getCell(sutun-1).toString();
        //Index 0'dan başladığı için bizden istenen satıra ulaşabilmek için bir eksiğini alırız
        System.out.println(actualData);

        String konsoldaYazan = "Baku";
        Assert.assertEquals(konsoldaYazan,actualData);

    }
}
