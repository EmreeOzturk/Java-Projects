package com.project.connection1;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Application1 {

    public static void main(String[] args){
        IDBManager dbManager = new MySqlDBManager(new Log4j2Manager());
       // dbManager.createPersonelTableWithPreparedStatement();
       // Personel personel =new Personel(101,"Burcin","Yildiran",2000,"987654321");
       // dbManager.savePersonel(personel);

       /* Personel personel =new Personel(102,"Reyhan","Yildiran",1999,"987654321");
        Personel personel2 =new Personel(103,"Mustafa","Ozturk",1999,"123123123");
        Personel personel3 =new Personel(104,"Mistik","Ozturk",1999,"321321321");
        Personel personel4 =new Personel(105,"XYZ","Yildiran",2000,"445566");
        Personel personel5 =new Personel(106,"YXZ","Yildiran",2000,"445566");
        List<Personel> personelList = new ArrayList<>();
        personelList.add(personel);
        personelList.add(personel2);
        personelList.add(personel3);
        personelList.add(personel4);
        personelList.add(personel5);
        dbManager.savePersonelList(personelList);*/

        /*Personel personel = new Personel(103,"Mustafa Emre","Ozturk",1999,"123123123");
        personel.setDogumYili(2000);
        dbManager.updatePersonel(personel);*/

       /* dbManager.deletePersonelByPersonelID(106);
        dbManager.deletePersonelByadi("XYZ");*/

        /*Personel personel = dbManager.findPersonelByID(105);
        System.out.println(personel);*/

       // dbManager.getPersonels().forEach(System.out::println);
    }

}
