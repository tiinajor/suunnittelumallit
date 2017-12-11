/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author Tiina
 */
public class HardDrive {
    
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	DataOutputStream dos = new DataOutputStream(baos);
	
	
	
	public byte[] read(long lba, int size) {
		try {
			dos.writeLong(lba*size);
			dos.close(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return baos.toByteArray();
	}

    
}
