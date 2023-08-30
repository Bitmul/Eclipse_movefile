package day10;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv tv = new Tv(false,1,50,100);
		
		tv.tvStat();
		tv.power();
		tv.power();
		tv.power();
		tv.vol_up(5);
		tv.vol_up(55);
		tv.vol_down(101);
		tv.vol_down(60);
		tv.tvStat();
		tv.chanel_down(51);
		tv.tvStat();
		tv.chanel_up(55);
		tv.tvStat();
		tv.power();
		

	}

}

class Tv
{
	private boolean power;
	private int chan;
	private int vol;
	private int max_chan;
	
	public Tv() {}
	public Tv(boolean power,int chan, int vol,int max) 
	{
		this.power = power;
		this.chan = chan;
		this.vol = vol;
		this.max_chan = max;
	}
	
	public void power()
	{
		if (this.power == true) 
		{
			System.out.println("\n전원을 끕니다.");
			this.power = false;
		}
		
		else if (this.power == false) 
		{
			System.out.println("\n전원을 켭니다.");
			this.power = true;
		}
	}
	
	public void vol_up (int vol)
	{
		System.out.println("\n볼륨을 " + vol + "만큼 올립니다..");
		if (this.vol+vol < 100)
		{
			this.vol = this.vol + vol;
			System.out.println("현재 볼륨 : " + this.vol);
		}
		else System.out.println("\n볼륨을 100을 초과하여 올릴 수 없습니다.\n현재 볼륨 : " + this.vol);
	}
	
	public void vol_down (int vol)
	{
		System.out.println("\n볼륨을 " + vol + "만큼 내립니다..");
		if (this.vol-vol > 0)
		{
			this.vol = this.vol - vol;
			System.out.println("현재 볼륨 : " + this.vol);
		}
		else System.out.println("\n볼륨을 0 미만으로 내릴 수 없습니다.\n현재 볼륨 : " + this.vol);
	}
	
	public void chanel_up(int plus)
	{
		System.out.println("\n채널을 " + plus + "만큼 올립니다.");
		if (this.chan+plus > this.max_chan)
		{
			this.chan =(this.chan+plus) - this.max_chan;
		}
		else this.chan = this.chan+plus;
		System.out.println("\n현재 채널은 " + this.chan + "입니다");
	}
	
	public void chanel_down(int down)
	{
		System.out.println("\n채널을 " + down + "만큼 내립니다.");
		if (this.chan-down < 0)
		{
			this.chan = this.max_chan - (down - this.chan);
		}
		else this.chan = this.chan-down;
		System.out.println("\n현재 채널은 " + this.chan + "입니다");
	}
	public boolean getPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChan() {
		return chan;
	}
	public void setChan(int chan) {
		this.chan = chan;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	
	public void tvStat() {
		System.out.println("\nTV 전원 상태 : " + this.power);
		System.out.println("현재 채널 : " + this.chan);
		System.out.println("현재 볼륨 : " + this.vol);
	}
}