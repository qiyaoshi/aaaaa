package com.atguigu.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 资源类
 * @author Administrator
 *
 */
public class SaleTicket{

	private int ticketAmount;
	private Lock lock = new ReentrantLock();
	
	public SaleTicket() {
		super();
		this.ticketAmount = 30;
	}
	
	public SaleTicket(int ticketAmount) {
		super();
		this.ticketAmount = ticketAmount;
	}

	public int getTicketAmount() {
		return ticketAmount;
	}

	public void sale(){
		lock.lock();
		try {
			if (ticketAmount > 0) {
				;
				String name = Thread.currentThread().getName();
				System.out.println(name + "\t购买第"+(ticketAmount--)+"张票" + "\t还剩" + ticketAmount);
			}
		} catch (Exception e) {

		} finally {
			lock.unlock();
		}
	}
	
}
