/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg1;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Admin
 */
public class demo1 extends Frame implements ActionListener{
    Button btnVang,btnDo;
    Label label=new Label();
    public demo1(String msg){
        setTitle(msg);
        setLayout(new FlowLayout());
        btnVang=new Button("Yellow");
        btnDo=new Button("Red");
        add(btnDo);
        add(btnVang);
        add(label);
        btnVang.addActionListener(this);
        btnDo.addActionListener(this);
    } 
   
    public static void main(String[] args) {
      demo1 demo=new demo1("Demo1");
      demo.setSize(400,400);
      demo.show();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    String str=ae.getActionCommand();
    if(str.equals("Yellow")){
        label.setText("Bạn đã chọn nút màu vàng");
        this.setBackground(Color.yellow);
    }
        if(str.equals("Red")){
        label.setText("Bạn đã chọn nút màu đỏ");
        this.setBackground(Color.red);
    }
    }
    
}
