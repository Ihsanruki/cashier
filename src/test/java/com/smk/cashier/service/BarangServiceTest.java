package com.smk.cashier.service;

import com.smk.cashier.model.Barang;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BarangServiceTest {
    //change

    @Test
    @Order(1)
    void addBarang() {
        Barang laptop = new Barang();
        laptop.setNamaBarang("Laptop");
        laptop.setKodeBarang("L0001");
        laptop.setHargaBarang(100000);
        BarangService.getInstance().addBarang(laptop);

        Barang mouse = new Barang();
        mouse.setNamaBarang("Mouse");
        mouse.setKodeBarang("L0002");
        mouse.setHargaBarang(10000);
        BarangService.getInstance().addBarang(mouse);

        Barang gamingLaptop = new Barang();
        gamingLaptop.setNamaBarang("Laptop Gaming");
        gamingLaptop.setKodeBarang("L0003");
        gamingLaptop.setHargaBarang(100000);
        BarangService.getInstance().addBarang(gamingLaptop);
    }

    @Test
    @Order(2)
    void getBarang() {
        List<Barang> barangList = new LinkedList<>();
        barangList = BarangService.getInstance().getBarangList();
        assertEquals(barangList.size(), 3);
    }

    @Test
    @Order(3)
    void findByName() {
        List<Barang> res = new LinkedList<>();
        res = BarangService.getInstance().findByName("Laptop");
        assertEquals(res.size(), 2);
    }
}