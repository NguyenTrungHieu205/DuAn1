/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;

import repository.ImeiRepository;
import service.ImeiService;
import viewModel.ImeiViewModel;

/**
 *
 * @author Admin
 */
public class ImeiServiceImpl implements ImeiService {

    private final ImeiRepository imeiRepository = new ImeiRepository();

    @Override
    public ArrayList<ImeiViewModel> getAll() {
        try {
            return imeiRepository.getAllImei();
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public ArrayList<ImeiViewModel> getAllXoa() {
        try {
            return imeiRepository.getAllXoa();
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public boolean addImei(ImeiViewModel imei) {
        try {
            return imeiRepository.addImei(imei);
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public boolean update(ImeiViewModel imei) {
        try {
            return imeiRepository.update(imei);
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public Integer delete(ImeiViewModel imei) {
        try {
            return imeiRepository.delete(imei);
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public Integer hoanTac(ImeiViewModel imei) {
        try {
            return imeiRepository.hoanTac(imei);
        } catch (Exception ex) {
            return null;
        }
    }

}
