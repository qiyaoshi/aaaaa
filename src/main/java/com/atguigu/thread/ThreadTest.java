package com.atguigu.thread;

/**
 * 多线程编程要点
 * ①线程操作资源类
 * ②高聚集，低耦合
 * @author Administrator
 *
 */
public class ThreadTest {
	public static void main(String[] args) {
		SaleTicket saleTicket = new SaleTicket(50);
		new Thread(() -> { while(saleTicket.getTicketAmount() > 0) {saleTicket.sale(); try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}}}, "A").start();
		new Thread(() -> { while(saleTicket.getTicketAmount() > 0) {saleTicket.sale(); try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}}}, "B").start();
		new Thread(() -> { while(saleTicket.getTicketAmount() > 0) {saleTicket.sale(); try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}}}, "C").start();
	}
}
