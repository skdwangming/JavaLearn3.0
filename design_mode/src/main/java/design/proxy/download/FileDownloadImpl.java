package design.proxy.download;

public class FileDownloadImpl implements FileDownloadInterface {

    @Override
    public boolean pictureDownload(String fileName) {
        try {
            System.out.println("begin download picture, name : " + fileName);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean videoDownload(String fileName) {
        System.out.println("begin download video, name : " + fileName);
        return true;
    }
}
