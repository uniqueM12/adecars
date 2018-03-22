package com.adecars.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adecars.dao.CarRepository;
import com.adecars.models.Car;
import com.adecars.models.Make;

@Service
public class CarServiceImpl implements CarService {
	@Autowired
	SellerService sellerService;

	@Autowired
	ModelService modelService;

	@Autowired
	MakeService makelService;

	@Autowired
	CarRepository carRepository;

	@Override
	public void save(Car car) throws IOException {

		InputStream inputStream1 = null;
		InputStream inputStream2 = null;
		InputStream inputStream3 = null;
		InputStream inputStream4 = null;
		InputStream inputStream5 = null;
		InputStream inputStream6 = null;
		InputStream inputStream7 = null;
		InputStream inputStream8 = null;
		InputStream inputStream9 = null;
		InputStream inputStream10 = null;

		if (!car.getCarImage1().isEmpty()) {
			byte[] imageByte1 = car.getCarImage1().getBytes();
			inputStream1 = new ByteArrayInputStream(imageByte1);
		}
		if (!car.getCarImage2().isEmpty()) {
			byte[] imageByte2 = car.getCarImage2().getBytes();
			inputStream2 = new ByteArrayInputStream(imageByte2);
		}
		if (!car.getCarImage3().isEmpty()) {
			byte[] imageByte3 = car.getCarImage3().getBytes();
			inputStream3 = new ByteArrayInputStream(imageByte3);
		}
		if (!car.getCarImage4().isEmpty()) {
			byte[] imageByte4 = car.getCarImage4().getBytes();
			inputStream4 = new ByteArrayInputStream(imageByte4);
		}
		if (!car.getCarImage5().isEmpty()) {
			byte[] imageByte5 = car.getCarImage5().getBytes();
			inputStream5 = new ByteArrayInputStream(imageByte5);
		}
		if (!car.getCarImage6().isEmpty()) {
			byte[] imageByte6 = car.getCarImage6().getBytes();
			inputStream6 = new ByteArrayInputStream(imageByte6);
		}
		if (!car.getCarImage7().isEmpty()) {
			byte[] imageByte7 = car.getCarImage7().getBytes();
			inputStream7 = new ByteArrayInputStream(imageByte7);
		}
		if (!car.getCarImage8().isEmpty()) {
			byte[] imageByte8 = car.getCarImage8().getBytes();
			inputStream8 = new ByteArrayInputStream(imageByte8);
		}
		if (!car.getCarImage9().isEmpty()) {
			byte[] imageByte9 = car.getCarImage9().getBytes();
			inputStream9 = new ByteArrayInputStream(imageByte9);
		}
		if (!car.getCarImage10().isEmpty()) {
			byte[] imageByte10 = car.getCarImage10().getBytes();
			inputStream10 = new ByteArrayInputStream(imageByte10);
		}

		car.setCarImage1(null);
		car.setCarImage2(null);
		car.setCarImage3(null);
		car.setCarImage4(null);
		car.setCarImage5(null);
		car.setCarImage6(null);
		car.setCarImage7(null);
		car.setCarImage8(null);
		car.setCarImage9(null);
		car.setCarImage10(null);

		Car saved = carRepository.save(car);

		String imageId = saved.getId();

		// if (!inputStream1.equals(null)) {
		// carImageRepositorys.save(inputStream1, imageId + "carImage1", "image/jpeg",
		// null);
		// }
		// if (!inputStream2.equals(null)) {
		// carImageRepositorys.save(inputStream2, imageId + "carImage2", "image/jpeg",
		// null);
		// }
		// if (!inputStream3.equals(null)) {
		// carImageRepositorys.save(inputStream3, imageId + "carImage3", "image/jpeg",
		// null);
		// }
		// if (!inputStream4.equals(null)) {
		// carImageRepositorys.save(inputStream4, imageId + "carImage4", "image/jpeg",
		// null);
		// }
		// if (!inputStream5.equals(null)) {
		// carImageRepositorys.save(inputStream5, imageId + "carImage5", "image/jpeg",
		// null);
		// }
		// if (!inputStream6.equals(null)) {
		// carImageRepositorys.save(inputStream6, imageId + "carImage6", "image/jpeg",
		// null);
		// }
		// if (!inputStream7.equals(null)) {
		// carImageRepositorys.save(inputStream7, imageId + "carImage7", "image/jpeg",
		// null);
		// }
		// if (!inputStream8.equals(null)) {
		// carImageRepositorys.save(inputStream8, imageId + "carImage8", "image/jpeg",
		// null);
		// }
		// if (!inputStream9.equals(null)) {
		// carImageRepositorys.save(inputStream9, imageId + "carImage9", "image/jpeg",
		// null);
		// }
		// if (!inputStream10.equals(null)) {
		// carImageRepositorys.save(inputStream10, imageId + "carImage10", "image/jpeg",
		// null);
		// }
		/*
		 * DBObject carDetails = new BasicDBObject(); carDetails.put("AC", car.getAC());
		 * carDetails.put("addPhone", car.getAddPhone()); carDetails.put("airBags",
		 * car.getAirBags()); carDetails.put("alloyWheel", car.getAlloyWheel());
		 * carDetails.put("antiLockBreaks", car.getAntiLockBrakes());
		 * carDetails.put("armRest", car.getArmRest()); carDetails.put("bodyType",
		 * car.getBodyType()); carDetails.put("bullBar", car.getBullBar());
		 * carDetails.put("CDPlayer", car.getCDPlayer()); carDetails.put("color",
		 * car.getColor()); carDetails.put("condition", car.getCondition());
		 * carDetails.put("cupHolder", car.getCupHolder()); carDetails.put("driveSetup",
		 * car.getDriveSetup()); carDetails.put("driveType", car.getDriveType());
		 * carDetails.put("electronicMirror", car.getElectronicMirror());
		 * carDetails.put("electronicWindow", car.getElectronicWindows());
		 * carDetails.put("engineSize", car.getEngineSize());
		 * carDetails.put("externalWinch", car.getExternalWinch());
		 * carDetails.put("FMRadio", car.getFMRadio()); carDetails.put("fogLights",
		 * car.getFogLights()); carDetails.put("frontFogLights",
		 * car.getFrontFogLights()); carDetails.put("fuel", car.getFuel());
		 * carDetails.put("interior", car.getInterior()); carDetails.put("keylessEntry",
		 * car.getKeylessEntry()); carDetails.put("KMDriven", car.getKMDriven());
		 * carDetails.put("lDesc", car.getlDesc()); carDetails.put("Location",
		 * car.getLocation()); carDetails.put("make",
		 * makelService.findOne(car.getMake().toString())); carDetails.put("model",
		 * modelService.findByModel(car.getModel().toString()));
		 * carDetails.put("negotiable", car.getNegotiable());
		 * carDetails.put("powerDoorLocks", car.getPowerDoorLocks());
		 * carDetails.put("powerSteering", car.getPowerSteering());
		 * carDetails.put("price", car.getPrice()); carDetails.put("rearCamera",
		 * car.getRearCamera()); carDetails.put("roofRack", car.getRoofRack());
		 * carDetails.put("sDesc", car.getsDesc()); carDetails.put("seller",
		 * sellerService.findByUserName(car.getSeller().toString()));
		 * carDetails.put("sidesteps", car.getSideSteps()); carDetails.put("spoilers",
		 * car.getSpoilers()); carDetails.put("spotLight", car.getSpotLight());
		 * carDetails.put("sunRoof", car.getSunRoof());
		 * carDetails.put("thumbStartIgnition", car.getThumbStartIgnition());
		 * carDetails.put("tintedWindows", car.getTintedWindows());
		 * carDetails.put("tractionControl", car.getTractionControl());
		 * carDetails.put("transmission", car.getTransmission());
		 * carDetails.put("turboCharged", car.getTurboCharged());
		 * carDetails.put("wheelLocks", car.getWheelLocks()); carDetails.put("winch",
		 * car.getWinch()); carDetails.put("xenonLight", car.getXenonLights());
		 * carDetails.put("year", car.getYear());
		 * 
		 * if (car.getCarImage6() != null) { byte[] scanBytes =
		 * car.getCarImage6().getBytes(); InputStream inputStream = new
		 * ByteArrayInputStream(scanBytes); } byte[] scanByte1 =
		 * car.getCarImage1().getBytes();
		 */
	}

	@Override
	public Make findOne(String id) {

		return null;
	}

	@Override
	public List<Car> findAll() {

		return null;
	}
}
