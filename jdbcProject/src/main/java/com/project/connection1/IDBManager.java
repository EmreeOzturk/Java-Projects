package com.project.connection1;

import java.util.List;

public interface IDBManager {
    void createPersonelTable();
    void createPersonelTableWithPreparedStatement();
    void savePersonel(Personel personel);
    void savePersonelList(List<Personel> personelList);
    Personel updatePersonel(Personel personel);
    void deletePersonelByPersonelID(int id);
    void deletePersonelByadi(String adi);
    Personel findPersonelByID(int id);
    List<Personel> getPersonels();
}

