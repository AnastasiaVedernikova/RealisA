import javafx.concurrent.*;

import java.util.ArrayList;

/**
 * Created by cs.ucu.edu.ua on 04.03.2017.
 */


public class ClassA implements Interf{
    private Integer ClientID = 1;
    private Integer ProjectID = 4;


//    public void setClientID(Integer t){
//        this.ClientID = t;
//    }
    public Integer getClientID(){
        return this.ClientID;
    }

//    public void setProjectID(Integer t){
//        this.ProjectID = t;
//    }
    public Integer getProjectID(){
        return this.ProjectID;
    }


    public Task DoAndBornTasks(Task st){
//        Task task = new Task();
//        task.setClientID(getClientID());
//        task.setProjectID(getProjectID());
        st.setResult(st.getData()+"!"+st.getData());//result
        st.setNewTask(st.getData()+"/"+st.getData());
        return st;
    }
    public Task doTask(Task st){
        st.setResult(st.getData()+"!"+st.getData());
        return st;

       // System.out.print("Implementation A(="+st.getData()+"=)");
    }

}
