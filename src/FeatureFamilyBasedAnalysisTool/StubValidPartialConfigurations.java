package FeatureFamilyBasedAnalysisTool;

import java.util.HashSet;

public class StubValidPartialConfigurations {

	//Features
	private static Feature oxygenation = Feature.getFeatureByName("Oxygenation");
	private static Feature pulseRate = Feature.getFeatureByName("PulseRate");
	private static Feature temperature = Feature.getFeatureByName("Temperature"); 
	private static Feature position = Feature.getFeatureByName("Position"); 
	private static Feature fall = Feature.getFeatureByName("Fall");
	
	private static Feature spo2 = Feature.getFeatureByName("SPO2"); 
	private static Feature ecg = Feature.getFeatureByName("ECG");
	private static Feature temp = Feature.getFeatureByName("Temp");
	private static Feature acc = Feature.getFeatureByName("ACC");
	
	private static Feature sqlite = Feature.getFeatureByName("Sqlite");
	private static Feature memory = Feature.getFeatureByName("Memory");
	private static Feature file = Feature.getFeatureByName("File");
	
	private static HashSet<Feature> featuresSensorInformation; 
	private static HashSet<Feature> featuresSensor;
	private static HashSet<Feature> featuresStorage; 
	
	private HashSet<PartialConfiguration> partialConfiguration; 
	
	private static void setUp() {
		//featuresSensorInformation
		featuresSensorInformation = new HashSet<Feature>();
		featuresSensorInformation.add(oxygenation);
		featuresSensorInformation.add(pulseRate);
		featuresSensorInformation.add(temperature);
		featuresSensorInformation.add(position);
		featuresSensorInformation.add(fall);

		//featuresSensor
		featuresSensor = new HashSet<Feature>();
		featuresSensor.add(spo2);
		featuresSensor.add(ecg);
		featuresSensor.add(temp);
		featuresSensor.add(acc);
		
		//featuresStorage
		featuresStorage = new HashSet<Feature>();
		featuresStorage.add(sqlite);
		featuresStorage.add(memory);
		featuresStorage.add(file);
	}
	
	
	public static HashSet<PartialConfiguration> getValidPartialConfigurations(
			HashSet<Feature> dependantFeatures) {
		setUp();
		
		if (dependantFeatures.containsAll(featuresSensorInformation)) {
			System.out.println("dependantFeatures.equals(featuresSensorInformation) = TRUE");
			return getSensorInformationValidPartialConfigurations();
		}
		else if (dependantFeatures.equals(featuresSensor)){
			System.out.println("dependantFeatures.equals(featuresSensor) = TRUE");
			return getSensorValidPartialConfigurations();
		} 
		else if (dependantFeatures.equals(featuresStorage)){
			System.out.println("dependantFeatures.equals(featuresStorage) = TRUE");
			return getStorageValidPartialConfigurations();
		}
		else {
			System.out.println("Nenhum grupo de features dependentes foi igual");
			return null;
		}
	}


	private static HashSet<PartialConfiguration> getStorageValidPartialConfigurations() {
		// TODO Auto-generated method stub
		return null;
	}


	private static HashSet<PartialConfiguration> getSensorValidPartialConfigurations() {
		return null;
	}


	private static HashSet<PartialConfiguration> getSensorInformationValidPartialConfigurations() {
		HashSet<PartialConfiguration> partialSensorInformation = new HashSet<PartialConfiguration>();
		
		//{}
		PartialConfiguration partial = new PartialConfiguration(new HashSet<Feature>());
		partialSensorInformation.add(partial);
		
		//{fall}
		partial = new PartialConfiguration(); 
		partial.addFeature(fall);
		partialSensorInformation.add(partial);

		//position	
		partial = new PartialConfiguration(); 
		partial.addFeature(position);
		partialSensorInformation.add(partial);
		
		//{position, fall}
		partial = new PartialConfiguration(); 
		partial.addFeature(position);
		partial.addFeature(fall);
		partialSensorInformation.add(partial);
		
		//{temperature}
		partial = new PartialConfiguration(); 
		partial.addFeature(temperature);
		partialSensorInformation.add(partial);
		
		//{temperature, fall}
		partial = new PartialConfiguration(); 
		partial.addFeature(temperature);
		partial.addFeature(fall);
		partialSensorInformation.add(partial);
		
		//{temperature, position}
		partial = new PartialConfiguration(); 
		partial.addFeature(temperature);
		partial.addFeature(position);
		partialSensorInformation.add(partial);

		//{temperature, position, fall}
		partial = new PartialConfiguration(); 
		partial.addFeature(temperature);
		partial.addFeature(position);
		partial.addFeature(fall);
		partialSensorInformation.add(partial);

		//{pulseRate}
		partial = new PartialConfiguration(); 
		partial.addFeature(pulseRate);
		partialSensorInformation.add(partial);
			
		//{pulseRate, fall}
		partial = new PartialConfiguration(); 
		partial.addFeature(pulseRate);
		partial.addFeature(fall);
		partialSensorInformation.add(partial);

		//{pulseRate, position}
		partial = new PartialConfiguration(); 
		partial.addFeature(pulseRate);
		partial.addFeature(position);
		partialSensorInformation.add(partial);

		//{pulseRate, position, fall}
		partial = new PartialConfiguration(); 
		partial.addFeature(pulseRate);
		partial.addFeature(position);
		partial.addFeature(fall);
		partialSensorInformation.add(partial);

		//{pulseRate, temperature}
		partial = new PartialConfiguration(); 
		partial.addFeature(pulseRate);
		partial.addFeature(temperature);
		partialSensorInformation.add(partial);

		//{pulseRate, temperature, fall}
		partial = new PartialConfiguration(); 
		partial.addFeature(pulseRate);
		partial.addFeature(temperature);
		partial.addFeature(fall);
		partialSensorInformation.add(partial);

		//{pulseRate, temperature, position}
		partial = new PartialConfiguration(); 
		partial.addFeature(pulseRate);
		partial.addFeature(temperature);
		partial.addFeature(position);
		partialSensorInformation.add(partial);

		//{pulseRate, temperature, position, fall}
		partial = new PartialConfiguration(); 
		partial.addFeature(pulseRate);
		partial.addFeature(temperature);
		partial.addFeature(position);
		partial.addFeature(fall);
		partialSensorInformation.add(partial);

		//{oxygenation}
		partial = new PartialConfiguration(); 
		partial.addFeature(oxygenation);
		partialSensorInformation.add(partial);

		//{oxygenation, fall}
		partial = new PartialConfiguration(); 
		partial.addFeature(oxygenation);
		partial.addFeature(fall);
		partialSensorInformation.add(partial);

		//{oxygenation, position}
		partial = new PartialConfiguration(); 
		partial.addFeature(oxygenation);
		partial.addFeature(position);
		partialSensorInformation.add(partial);

		//{oxygenation, position, fall}
		partial = new PartialConfiguration(); 
		partial.addFeature(oxygenation);
		partial.addFeature(position);
		partial.addFeature(fall);
		partialSensorInformation.add(partial);

		//{oxygenation, temperature}
		partial = new PartialConfiguration(); 
		partial.addFeature(oxygenation);
		partial.addFeature(temperature);
		partialSensorInformation.add(partial);

		//{oxygenation, temperature, fall}
		partial = new PartialConfiguration(); 
		partial.addFeature(oxygenation);
		partial.addFeature(temperature);
		partial.addFeature(fall);
		partialSensorInformation.add(partial);

		//{oxygenation, temperature, position}
		partial = new PartialConfiguration(); 
		partial.addFeature(oxygenation);
		partial.addFeature(temperature);
		partial.addFeature(position);
		partialSensorInformation.add(partial);

		//{oxygenation, temperature, position, fall}
		partial = new PartialConfiguration(); 
		partial.addFeature(oxygenation);
		partial.addFeature(temperature);
		partial.addFeature(position);
		partial.addFeature(fall);
		partialSensorInformation.add(partial);

		//{oxygenation, pulseRate}
		partial = new PartialConfiguration(); 
		partial.addFeature(oxygenation);
		partial.addFeature(pulseRate);
		partialSensorInformation.add(partial);

		//{oxygenation, pulseRate, fall}
		partial = new PartialConfiguration(); 
		partial.addFeature(oxygenation);
		partial.addFeature(pulseRate);
		partial.addFeature(fall);
		partialSensorInformation.add(partial);

		//{oxygenation, pulseRate, position}
		partial = new PartialConfiguration(); 
		partial.addFeature(oxygenation);
		partial.addFeature(pulseRate);
		partial.addFeature(position);
		partialSensorInformation.add(partial);

		//{oxygenation, pulseRate, position, fall}
		partial = new PartialConfiguration(); 
		partial.addFeature(oxygenation);
		partial.addFeature(pulseRate);
		partial.addFeature(position);
		partial.addFeature(fall);
		partialSensorInformation.add(partial);

		//{oxygenation	pulseRate	temperature}
		partial = new PartialConfiguration(); 
		partial.addFeature(oxygenation);
		partial.addFeature(pulseRate);
		partial.addFeature(temperature);
		partialSensorInformation.add(partial);

		//{oxygenation, pulseRate, temperature, fall}
		partial = new PartialConfiguration(); 
		partial.addFeature(oxygenation);
		partial.addFeature(pulseRate);
		partial.addFeature(temperature);
		partial.addFeature(fall);
		partialSensorInformation.add(partial);

		//{oxygenation, pulseRate, temperature, position}
		partial = new PartialConfiguration(); 
		partial.addFeature(oxygenation);
		partial.addFeature(pulseRate);
		partial.addFeature(temperature);
		partial.addFeature(position);
		partialSensorInformation.add(partial);

		//{oxygenation, pulseRate, temperature, position, fall}
		partial = new PartialConfiguration(); 
		partial.addFeature(oxygenation);
		partial.addFeature(pulseRate);
		partial.addFeature(temperature);
		partial.addFeature(position);
		partial.addFeature(fall);
		partialSensorInformation.add(partial);


		return partialSensorInformation;
	}

}