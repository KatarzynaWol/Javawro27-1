package pl.sda.rafal.zientara.programowanie2.lesson2.henioSimulation;

import java.io.IOException;
import java.util.Random;

public class DownloadProcess implements Runnable {

    public interface onProgressListener{
        void finished();
        void onError();
    }

    private onProgressListener listener;

    @Override
    public void run() {
        try {
            System.out.println("Downloading...");
            pretendRandomError();
            pretendDownloading();
            System.out.println("Finished downloading!");
            if(listener!=null){
                listener.finished();
            }
        } catch (Exception e) {
            e.printStackTrace();
            if(listener != null){
                listener.onError();
            }
        }

    }

    private void pretendRandomError() throws IOException {
        int isError = new Random().nextInt(2);
        if(isError != 0){
            throw new IOException("Lipa");
        }
    }

    private void pretendDownloading() throws InterruptedException {
        Thread.sleep(100 + new Random().nextInt(3000));
    }

    public void setListener(onProgressListener listener) {
        this.listener = listener;
    }
}
