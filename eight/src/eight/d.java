package eight;

public class d {
	 public static void main(String[] args){
	        StopWatch w=new StopWatch();
	        w.start();
	        for(int i=0;i<9999999;i++){
	            for(int j=0;j<9999999;j++){
	            }
	        }
	        w.stop();
	        System.out.println(w.getElapsedTime());
	    }
}

class StopWatch{
    //私有域startTime和endTime
    private long startTime;
    private long endTime;
    public StopWatch(){
        this.startTime=System.currentTimeMillis();
    }
    //start()和stop()方法
    public void start(){
        this.startTime=System.currentTimeMillis();
    }
    public void stop(){
        this.endTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime-startTime;
    }
    //两个访问器方法
    public long getstartTime(){
        return startTime;
    }
    public long getendTime(){
        return endTime;
    }
}
