/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;
import java.util.ArrayList;
import java.util.List;

import viewModel.ImeiViewModel;

/**
 *
 * @author Admin
 */
public interface ImeiService {
    ArrayList<ImeiViewModel> getAll();

    ArrayList<ImeiViewModel> getAllXoa();

    boolean addImei(ImeiViewModel imei );

    boolean update(ImeiViewModel imei);

    Integer delete(ImeiViewModel imei);

    Integer hoanTac(ImeiViewModel imei);
}
