package cn.lhj.WEManager.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	/*
	 * public static void main(String[] args) { }
	 */
	//获取上个月份
	public Date getLastMonth() throws Exception{
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        Date last= calendar.getTime();
//        System.out.println(last);
        return last;
	}
	
	//获取本月第一天
	public Date getThisMonthFirst() throws Exception{
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        Date thisMonth= calendar.getTime();
//        System.out.println(thisMonth);
        return thisMonth;
	}
}
