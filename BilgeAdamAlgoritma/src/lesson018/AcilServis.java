package lesson018;

import java.util.PriorityQueue;
import java.util.Queue;

public class AcilServis {

	public static void main(String[] args) {
		Queue<Hasta> acilServis = new PriorityQueue<Hasta>();
		
		acilServis.offer(new Hasta("Mustafa", "Apandist"));
		acilServis.offer(new Hasta("Oguz", "Apandist"));
		acilServis.offer(new Hasta("Kemal", "Ağrı"));
		acilServis.offer(new Hasta("Ayşe", "Yanık"));
		acilServis.offer(new Hasta("Zeliha", "Yanık"));
		acilServis.offer(new Hasta("Okan", "Apandist"));
		acilServis.offer(new Hasta("Orhan", "Yanık"));
		acilServis.offer(new Hasta("Merve", "Yanık"));
		acilServis.offer(new Hasta("Gizem", "Ağrı"));
		acilServis.offer(new Hasta("Muharrem", "Apandist"));
		
		while (!acilServis.isEmpty()) {
			System.out.println(acilServis.peek().getIsim() + " " + acilServis.poll().getOncelik());
		}
		
		System.out.println("enum---");
		Queue<Hasta> acilServis3 = new PriorityQueue<Hasta>();
		
		acilServis3.offer(new Hasta("Mustafa", ESikayet.APANDIST));
		acilServis3.offer(new Hasta("Oguz", ESikayet.APANDIST));
		acilServis3.offer(new Hasta("Kemal", ESikayet.AGRI));
		acilServis3.offer(new Hasta("Ayşe", ESikayet.YANIK));
		acilServis3.offer(new Hasta("Zeliha", ESikayet.YANIK));
		acilServis3.offer(new Hasta("Okan", ESikayet.APANDIST));
		acilServis3.offer(new Hasta("Orhan", ESikayet.YANIK));
		acilServis3.offer(new Hasta("Merve", ESikayet.YANIK));
		acilServis3.offer(new Hasta("Gizem", ESikayet.AGRI));
		acilServis3.offer(new Hasta("Muharrem", ESikayet.APANDIST));

	}

}
