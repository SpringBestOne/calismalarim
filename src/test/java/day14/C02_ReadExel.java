package day14;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C02_ReadExel {
    @Test
    public void readExelTest1() throws IOException {
        //- Dosya yolunu bir String degiskene atayalim
        String dosyaYolu="C:\\Users\\samsung\\Downloads\\ulkeler.xlsx";

        //- FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis=new FileInputStream(dosyaYolu); //Oluşturduğumuz dosyayı sisteme alır.

        //- Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        //- WorkbookFactory.create(fileInputStream)
        Workbook workbook= WorkbookFactory.create(fis); //Workbook objesi ilefis objesi ile akışa aldığımız dosyamızla bir wxel dosyası create ettik

        //- Sheet objesi olusturun workbook.getSheetAt(index)


        //- Row objesi olusturun sheet.getRow(index)


        //- Cell objesi olusturun row.getCell(index)


        //- 3. index'deki satirin 3. index'indeki datanin Cezayir oldugunu test edin

        String actualData=workbook.
                getSheet("Sayfa1").
                getRow(3).
                getCell(3).toString();
        System.out.println(actualData);





    }
}
