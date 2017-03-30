package less11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class RestorerBF implements Restorer{

	@Override
	public Bank restore(String fileName) {
		File file = new File(fileName+".save");
		try(InputStream is = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(is)){
			Object obj = ois.readObject();
			return (Bank)obj;
		}catch (IOException | ClassNotFoundException e){
		}
		return new Bank();
	}

}
