package com.cocheCRUD;

import java.util.List;

public interface CocheCRUD {
    void save(Coche cocheNuevo);
    List<Coche> findAll();
    void delete(Coche coche);
}
