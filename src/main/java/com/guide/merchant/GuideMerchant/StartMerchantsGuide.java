package com.guide.merchant.GuideMerchant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartMerchantsGuide 
{
	private static final Logger logger = LoggerFactory.getLogger(StartMerchantsGuide.class);
	
	private static String filePath = "src/main/resources/input.txt";
	
    public static void main( String[] args )
    {

        try{
              ReadInputAndProcess readInput = new ReadInputAndProcess();
              readInput.readFileAndProcess(filePath);
              DisplayOutput.processOutput();
        }
        catch(Exception e){
        	logger.error("Error in processing input file " + e);
        }

    }
}