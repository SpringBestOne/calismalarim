package day14;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C01_ReadExel {
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
        Sheet sheet=workbook.getSheet("Sayfa1"); //Exelde calışmak istediğimiz sayfayı bu şekilde seçeriz

        //- Row objesi olusturun sheet.getRow(index)
        Row row=sheet.getRow(3);   //Sayfa 1 deki 3. satırı bu şekikde seçeriz

        //- Cell objesi olusturun row.getCell(index)
        Cell cell=row.getCell(3);  //Satır seçimi yapıldıktan sonra hücre seçimi bu şekilde yapılır
        System.out.println(cell);

        //- 3. index'deki satirin 3. index'indeki datanin Cezayir oldugunu test edin
        String expectedData="Cezayir";
        String actualData=cell.toString();
        Assert.assertEquals(expectedData,actualData);



    }
}
