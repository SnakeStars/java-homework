package task13;

public class Storage {

    String info;

    void openStorageSuccessful(){
        try(CustomResource link = new CustomResource()){
            System.out.println("block try in successful");
            this.info = link.readInfoSuccessful();
        }
    }

    void openStorageFailure(){
        try(CustomResource link = new CustomResource()){
            System.out.println("block try in failure");
            this.info = link.readInfoFailure();
        }
    }

    String getInfo(){
        return this.info;
    }
}
