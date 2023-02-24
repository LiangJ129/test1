package com.baorui.common;

import com.baorui.pojo.Goods;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Acc_Br
 * @date 2022/5/17 17:40
 */
@AllArgsConstructor
@Data
public class Resp{
    private int code;
    private String msg;
    private int count;
    private List<Goods> data ;
}
