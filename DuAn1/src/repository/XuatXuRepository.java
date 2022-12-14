/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import ultility.DBContext;
import viewModel.MauSacViewModel;
import viewModel.XuatXuViewModel;

/**
 *
 * @author ADMIN
 */
public class XuatXuRepository {
    public ArrayList<XuatXuViewModel> getAll() throws SQLException {
        ArrayList<XuatXuViewModel> listXX = new ArrayList<>();
        String sql = "SELECT Ma, TenNoiXX, TrangThai FROM XuatXu";
        Connection conn = DBContext.getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            XuatXuViewModel xx = new XuatXuViewModel();
            xx.setMa(rs.getString(1));
            xx.setTen(rs.getString(2));
            xx.setTrangThai(rs.getInt(3));
            listXX.add(xx);
        }
        return listXX;
    }

    public boolean create(XuatXuViewModel xx) throws SQLException {
        String sql = "INSERT INTO XuatXu (Ma, TenNoiXX, TrangThai) VALUES (?,?,?)";
        try ( Connection conn = DBContext.getConnection();  PreparedStatement stm = conn.prepareStatement(sql);) {
           stm.setString(1, xx.getMa());
           stm.setString(2, xx.getTen());
           stm.setInt(3, xx.getTrangThai());
           stm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;

    }
     public boolean update(XuatXuViewModel xx) throws SQLException {
        String sql = "UPDATE XuatXu SET TenNoiXX = ?, TrangThai = ? WHERE Ma =? ";
        try ( Connection conn = DBContext.getConnection();  PreparedStatement stm = conn.prepareStatement(sql);) {
           stm.setString(1, xx.getTen());
           stm.setInt(2, xx.getTrangThai());
           stm.setString(3, xx.getMa());
           stm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;

    }
     public ArrayList<XuatXuViewModel> getAllXoa() throws SQLException {
        ArrayList<XuatXuViewModel> listmx = new ArrayList<>();
        String sql = "SELECT Ma, TenNoiXX FROM XuatXu WHERE TrangThai = '4' ";
        Connection conn = DBContext.getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            XuatXuViewModel xx = new XuatXuViewModel();
            xx.setMa(rs.getString(1));
            xx.setTen(rs.getString(2));
            listmx.add(xx);
        }
        return listmx;
    }
     public boolean updateTT(XuatXuViewModel xx) throws SQLException {
        String sql = "UPDATE XuatXu SET TrangThai = '4' WHERE Ma =? ";
        try ( Connection conn = DBContext.getConnection();  PreparedStatement stm = conn.prepareStatement(sql);) {
           stm.setString(1, xx.getMa());
           stm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;

    }
     public boolean updateTT3(XuatXuViewModel xx) throws SQLException {
        String sql = "UPDATE XuatXu SET TrangThai = '0' WHERE Ma =? ";
        try ( Connection conn = DBContext.getConnection();  PreparedStatement stm = conn.prepareStatement(sql);) {
           stm.setString(1, xx.getMa());
           stm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;

    }
}
