package tr.com.alicolaker.arizabildirimi;



import android.app.ProgressDialog;
import android.content.Context;

class ProgresssBar {
    private ProgressDialog dialog;

    ProgresssBar(Context context){
        dialog=new ProgressDialog(context);
    }


    void dialogShow(String message){
        dialog.setMessage(message);
        dialog.setCancelable(false);
        dialog.setInverseBackgroundForced(false);
        dialog.show();
    }

    void dialogClose(){
        dialog.cancel();
    }
}
