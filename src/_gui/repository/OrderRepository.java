package _gui.repository;

import _gui.entity.Order;
import jdbc.JDBCConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderRepository {

    ArrayList<Order> orderList = new ArrayList<Order>();

    public ArrayList<Order> getOrderList(String searchWord) {
        Connection con = JDBCConnector.getConnection();
        String sql = "select 주문번호, 고객이름, 제품명, 수량, 배송지, 주문일자 from 주문 o, 고객 c, 제품 p " +
                "   where o.주문고객 = c.고객아이디 and o.주문제품 = p.제품번호 and c.고객이름 like ?";
        Order order = null;
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1,"%" + searchWord + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                order = new Order();
                order.setOrderNum(rs.getString("주문번호"));
                order.setOrderCustomer(rs.getString("고객이름"));
                order.setOrderProduct(rs.getString("제품명"));
                order.setAmount(rs.getInt("수량"));
                order.setDestination(rs.getString("배송지"));
                order.setOrderDate(rs.getTimestamp("주문일자"));

                orderList.add(order);
            }
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return orderList;
    }
}
