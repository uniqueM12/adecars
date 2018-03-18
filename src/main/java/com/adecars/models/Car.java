/**
 * 
 */
package com.adecars.models;

import javax.persistence.Embedded;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.multipart.MultipartFile;

/**
 * Since 22:45:16 | 10 Sep 2017
 *
 * @author uniqueM
 */

@Document
public class Car {

	@Id
	private String id;

	@Embedded
	@NotBlank(message = "User Name field cannot be empty")
	private Seller seller;

	@Embedded
	@NotBlank(message = "The Manufactuer must be selected")
	private Make make;

	@Embedded
	@NotBlank(message = "The model must be Selected")
	private Model model;

	@NotBlank
	private String condition;

	@NotBlank(message = "You must specify the color of the car")
	private String color;

	@NotBlank
	private String location;

	@NotBlank(message = "Please give a short description of the car, this is what will be displayed in your advert")
	@Size(min = 15, max = 40, message = "please input text between of count of 15 and 40")
	private String sDesc;

	@NotBlank(message = "Please you must specify a price for the car")
	private Float price;

	@NotBlank(message = "please select a Body Type")
	private String bodyType;

	private String KMDriven;

	private String year;

	private Boolean negotiable;

	private String transmission;

	private String fuel;

	private String engineSize;

	@NotBlank
	private String interior;

	private String doorCount;

	private String driveType;

	private String driveSetup;

	private String addPhone;

	private Boolean AC;

	private Boolean airBags;

	private Boolean alloyWheel;

	private Boolean FMRadio;

	private Boolean antiLockBrakes;

	private Boolean armRest;

	private Boolean bullBar;

	private Boolean CDPlayer;

	private Boolean cupHolder;

	private Boolean electronicMirror;

	private Boolean electronicWindows;

	private Boolean externalWinch;

	private Boolean fogLights;

	private Boolean frontFogLights;

	private Boolean keylessEntry;

	private Boolean powerSteering;

	private Boolean powerDoorLocks;

	private Boolean rearCamera;

	private Boolean roofRack;

	private Boolean sideSteps;

	private Boolean spoilers;

	private Boolean spotLight;

	private Boolean sunRoof;

	private Boolean thumbStartIgnition;

	private Boolean tintedWindows;

	private Boolean tractionControl;

	private Boolean turboCharged;

	private Boolean wheelLocks;

	private Boolean winch;

	private Boolean xenonLights;

	@Size(max = 600, message = "please input a descrption less than or equall to 600 characters or leave this field empty")
	private String lDesc;

	@NotBlank(message = "You must choose an image for this field")
	private MultipartFile carImage1;

	@NotBlank(message = "You must choose an image for this field")
	private MultipartFile carImage2;

	@NotBlank(message = "You must choose an image for this field")
	private MultipartFile carImage3;

	@NotBlank(message = "You must choose an image for this field")
	private MultipartFile carImage4;

	@NotBlank(message = "You must choose an image for this field")
	private MultipartFile carImage5;

	private MultipartFile carImage6;

	private MultipartFile carImage7;

	private MultipartFile carImage8;

	private MultipartFile carImage9;

	private MultipartFile carImage10;

	public Car() {
		// TODO Auto-generated constructor stub

	}

	public String getId() {

		return id;
	}

	public void setId(@NotBlank String id) {

		this.id = id;
	}

	public Seller getSeller() {

		return seller;
	}

	public void setSeller(Seller seller) {

		this.seller = seller;
	}

	public Make getMake() {

		return make;
	}

	public void setMake(Make make) {

		this.make = make;
	}

	public Model getModel() {

		return model;
	}

	public void setModel(Model model) {

		this.model = model;
	}

	public String getCondition() {

		return condition;
	}

	public void setCondition(String condition) {

		this.condition = condition;
	}

	public String getColor() {

		return color;
	}

	public void setColor(String color) {

		this.color = color;
	}

	public String getLocation() {

		return location;
	}

	public void setLocation(String location) {

		this.location = location;
	}

	public String getsDesc() {

		return sDesc;
	}

	public void setsDesc(String sDesc) {

		this.sDesc = sDesc;
	}

	public Float getPrice() {

		return price;
	}

	public void setPrice(Float price) {

		this.price = price;
	}

	public String getBodyType() {

		return bodyType;
	}

	public void setBodyType(String bodyType) {

		this.bodyType = bodyType;
	}

	public String getKMDriven() {

		return KMDriven;
	}

	public void setKMDriven(String kMDriven) {

		KMDriven = kMDriven;
	}

	public String getYear() {

		return year;
	}

	public void setYear(String year) {

		this.year = year;
	}

	public Boolean getNegotiable() {

		return negotiable;
	}

	public void setNegotiable(Boolean negotiable) {

		this.negotiable = negotiable;
	}

	public String getTransmission() {

		return transmission;
	}

	public void setTransmission(String transmission) {

		this.transmission = transmission;
	}

	public String getFuel() {

		return fuel;
	}

	public void setFuel(String fuel) {

		this.fuel = fuel;
	}

	public String getEngineSize() {

		return engineSize;
	}

	public void setEngineSize(String engineSize) {

		this.engineSize = engineSize;
	}

	public String getInterior() {

		return interior;
	}

	public void setInterior(String interior) {

		this.interior = interior;
	}

	public String getDoorCount() {

		return doorCount;
	}

	public void setDoorCount(String doorCount) {

		this.doorCount = doorCount;
	}

	public String getDriveType() {

		return driveType;
	}

	public void setDriveType(String driveType) {

		this.driveType = driveType;
	}

	public String getDriveSetup() {

		return driveSetup;
	}

	public void setDriveSetup(String driveSetup) {

		this.driveSetup = driveSetup;
	}

	public String getAddPhone() {

		return addPhone;
	}

	public void setAddPhone(String addPhone) {

		this.addPhone = addPhone;
	}

	public Boolean getAC() {

		return AC;
	}

	public void setAC(Boolean aC) {

		AC = aC;
	}

	public Boolean getAirBags() {

		return airBags;
	}

	public void setAirBags(Boolean airBags) {

		this.airBags = airBags;
	}

	public Boolean getAlloyWheel() {

		return alloyWheel;
	}

	public void setAlloyWheel(Boolean alloyWheel) {

		this.alloyWheel = alloyWheel;
	}

	public Boolean getFMRadio() {

		return FMRadio;
	}

	public void setFMRadio(Boolean fMRadio) {

		FMRadio = fMRadio;
	}

	public Boolean getAntiLockBrakes() {

		return antiLockBrakes;
	}

	public void setAntiLockBrakes(Boolean antiLockBrakes) {

		this.antiLockBrakes = antiLockBrakes;
	}

	public Boolean getArmRest() {

		return armRest;
	}

	public void setArmRest(Boolean armRest) {

		this.armRest = armRest;
	}

	public Boolean getBullBar() {

		return bullBar;
	}

	public void setBullBar(Boolean bullBar) {

		this.bullBar = bullBar;
	}

	public Boolean getCDPlayer() {

		return CDPlayer;
	}

	public void setCDPlayer(Boolean cDPlayer) {

		CDPlayer = cDPlayer;
	}

	public Boolean getCupHolder() {

		return cupHolder;
	}

	public void setCupHolder(Boolean cupHolder) {

		this.cupHolder = cupHolder;
	}

	public Boolean getElectronicMirror() {

		return electronicMirror;
	}

	public void setElectronicMirror(Boolean electronicMirror) {

		this.electronicMirror = electronicMirror;
	}

	public Boolean getElectronicWindows() {

		return electronicWindows;
	}

	public void setElectronicWindows(Boolean electronicWindows) {

		this.electronicWindows = electronicWindows;
	}

	public Boolean getExternalWinch() {

		return externalWinch;
	}

	public void setExternalWinch(Boolean externalWinch) {

		this.externalWinch = externalWinch;
	}

	public Boolean getFogLights() {

		return fogLights;
	}

	public void setFogLights(Boolean fogLights) {

		this.fogLights = fogLights;
	}

	public Boolean getFrontFogLights() {

		return frontFogLights;
	}

	public void setFrontFogLights(Boolean frontFogLights) {

		this.frontFogLights = frontFogLights;
	}

	public Boolean getKeylessEntry() {

		return keylessEntry;
	}

	public void setKeylessEntry(Boolean keylessEntry) {

		this.keylessEntry = keylessEntry;
	}

	public Boolean getPowerSteering() {

		return powerSteering;
	}

	public void setPowerSteering(Boolean powerSteering) {

		this.powerSteering = powerSteering;
	}

	public Boolean getPowerDoorLocks() {

		return powerDoorLocks;
	}

	public void setPowerDoorLocks(Boolean powerDoorLocks) {

		this.powerDoorLocks = powerDoorLocks;
	}

	public Boolean getRearCamera() {

		return rearCamera;
	}

	public void setRearCamera(Boolean rearCamera) {

		this.rearCamera = rearCamera;
	}

	public Boolean getRoofRack() {

		return roofRack;
	}

	public void setRoofRack(Boolean roofRack) {

		this.roofRack = roofRack;
	}

	public Boolean getSideSteps() {

		return sideSteps;
	}

	public void setSideSteps(Boolean sideSteps) {

		this.sideSteps = sideSteps;
	}

	public Boolean getSpoilers() {

		return spoilers;
	}

	public void setSpoilers(Boolean spoilers) {

		this.spoilers = spoilers;
	}

	public Boolean getSpotLight() {

		return spotLight;
	}

	public void setSpotLight(Boolean spotLight) {

		this.spotLight = spotLight;
	}

	public Boolean getSunRoof() {

		return sunRoof;
	}

	public void setSunRoof(Boolean sunRoof) {

		this.sunRoof = sunRoof;
	}

	public Boolean getThumbStartIgnition() {

		return thumbStartIgnition;
	}

	public void setThumbStartIgnition(Boolean thumbStartIgnition) {

		this.thumbStartIgnition = thumbStartIgnition;
	}

	public Boolean getTintedWindows() {

		return tintedWindows;
	}

	public void setTintedWindows(Boolean tintedWindows) {

		this.tintedWindows = tintedWindows;
	}

	public Boolean getTractionControl() {

		return tractionControl;
	}

	public void setTractionControl(Boolean tractionControl) {

		this.tractionControl = tractionControl;
	}

	public Boolean getTurboCharged() {

		return turboCharged;
	}

	public void setTurboCharged(Boolean turboCharged) {

		this.turboCharged = turboCharged;
	}

	public Boolean getWheelLocks() {

		return wheelLocks;
	}

	public void setWheelLocks(Boolean wheelLocks) {

		this.wheelLocks = wheelLocks;
	}

	public Boolean getWinch() {

		return winch;
	}

	public void setWinch(Boolean winch) {

		this.winch = winch;
	}

	public Boolean getXenonLights() {

		return xenonLights;
	}

	public void setXenonLights(Boolean xenonLights) {

		this.xenonLights = xenonLights;
	}

	public String getlDesc() {

		return lDesc;
	}

	public void setlDesc(String lDesc) {

		this.lDesc = lDesc;
	}

	public MultipartFile getCarImage1() {

		return carImage1;
	}

	public void setCarImage1(MultipartFile carImage1) {

		this.carImage1 = carImage1;
	}

	public MultipartFile getCarImage2() {

		return carImage2;
	}

	public void setCarImage2(MultipartFile carImage2) {

		this.carImage2 = carImage2;
	}

	public MultipartFile getCarImage3() {

		return carImage3;
	}

	public void setCarImage3(MultipartFile carImage3) {

		this.carImage3 = carImage3;
	}

	public MultipartFile getCarImage4() {

		return carImage4;
	}

	public void setCarImage4(MultipartFile carImage4) {

		this.carImage4 = carImage4;
	}

	public MultipartFile getCarImage5() {

		return carImage5;
	}

	public void setCarImage5(MultipartFile carImage5) {

		this.carImage5 = carImage5;
	}

	public MultipartFile getCarImage6() {

		return carImage6;
	}

	public void setCarImage6(MultipartFile carImage6) {

		this.carImage6 = carImage6;
	}

	public MultipartFile getCarImage7() {

		return carImage7;
	}

	public void setCarImage7(MultipartFile carImage7) {

		this.carImage7 = carImage7;
	}

	public MultipartFile getCarImage8() {

		return carImage8;
	}

	public void setCarImage8(MultipartFile carImage8) {

		this.carImage8 = carImage8;
	}

	public MultipartFile getCarImage9() {

		return carImage9;
	}

	public void setCarImage9(MultipartFile carImage9) {

		this.carImage9 = carImage9;
	}

	public MultipartFile getCarImage10() {

		return carImage10;
	}

	public void setCarImage10(MultipartFile carImage10) {

		this.carImage10 = carImage10;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", seller=" + seller + ", make=" + make + ", model=" + model + ", condition="
		        + condition + ", color=" + color + ", location=" + location + ", sDesc=" + sDesc + ", price=" + price
		        + ", bodyType=" + bodyType + ", KMDriven=" + KMDriven + ", year=" + year + ", negotiable=" + negotiable
		        + ", transmission=" + transmission + ", fuel=" + fuel + ", engineSize=" + engineSize + ", interior="
		        + interior + ", doorCount=" + doorCount + ", driveType=" + driveType + ", driveSetup=" + driveSetup
		        + ", addPhone=" + addPhone + ", AC=" + AC + ", airBags=" + airBags + ", alloyWheel=" + alloyWheel
		        + ", FMRadio=" + FMRadio + ", antiLockBrakes=" + antiLockBrakes + ", armRest=" + armRest + ", bullBar="
		        + bullBar + ", CDPlayer=" + CDPlayer + ", cupHolder=" + cupHolder + ", electronicMirror="
		        + electronicMirror + ", electronicWindows=" + electronicWindows + ", externalWinch=" + externalWinch
		        + ", fogLights=" + fogLights + ", frontFogLights=" + frontFogLights + ", keylessEntry=" + keylessEntry
		        + ", powerSteering=" + powerSteering + ", powerDoorLocks=" + powerDoorLocks + ", rearCamera="
		        + rearCamera + ", roofRack=" + roofRack + ", sideSteps=" + sideSteps + ", spoilers=" + spoilers
		        + ", spotLight=" + spotLight + ", sunRoof=" + sunRoof + ", thumbStartIgnition=" + thumbStartIgnition
		        + ", tintedWindows=" + tintedWindows + ", tractionControl=" + tractionControl + ", turboCharged="
		        + turboCharged + ", wheelLocks=" + wheelLocks + ", winch=" + winch + ", xenonLights=" + xenonLights
		        + ", lDesc=" + lDesc + "]";
	}

}
