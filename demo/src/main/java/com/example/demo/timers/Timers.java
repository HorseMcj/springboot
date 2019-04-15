/**
 * -------------------------------------------------------------*
 *                     COPYRIGHT(C) 2018                        *
 *   National Audit Office of the People’s Republic Of China    *
 *                                                              *
 *                                                              *
 *  This work contains confidential business information        *
 *  and intellectual property of CNAO.                          *
 *  All rights reserved.                                        *
 * -------------------------------------------------------------*
 */
/****************************************************************
 * Revision information:
 *
 *@version	1.0	2019年4月15日	Initial release (ChenJunMa)
 *			
 ***************************************************************/
package com.example.demo.timers;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.stereotype.Service;

/**
 * @author ChenJunMa
 * @date 2019年4月15日
 * @description 
 * 
 */
@Service
public class Timers {
	
	private static Timer timer = new Timer();

	public Timers() {
		TimersInfo timerInfo = new TimersInfo();
		timer.scheduleAtFixedRate(timerInfo, 10 * 1000, 10 * 1000);
		System.err.println("开始计时...");
	}
	
	private class TimersInfo extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			Date date = new Date();
			System.err.println(date);
		}
		
	}
}
