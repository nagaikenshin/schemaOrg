package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.auto.Clazz.BusOrCoach;
import org.kyojo.schemaorg.m3n5.auto.Clazz.Motorcycle;
import org.kyojo.schemaorg.m3n5.auto.Clazz.MotorizedBicycle;
import org.kyojo.schemaorg.m3n5.core.Clazz.Car;
import org.kyojo.schemaorg.m3n5.core.Clazz.IndividualProduct;
import org.kyojo.schemaorg.m3n5.core.Clazz.OwnershipInfo;
import org.kyojo.schemaorg.m3n5.core.Clazz.Product;
import org.kyojo.schemaorg.m3n5.core.Clazz.ProductModel;
import org.kyojo.schemaorg.m3n5.core.Clazz.SomeProducts;
import org.kyojo.schemaorg.m3n5.core.Clazz.Vehicle;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class OWNS implements Container.Owns {

	private static final long serialVersionUID = 1L;

	public List<BusOrCoach> busOrCoachList;
	public List<Car> carList;
	public List<IndividualProduct> individualProductList;
	public List<Motorcycle> motorcycleList;
	public List<MotorizedBicycle> motorizedBicycleList;
	public List<OwnershipInfo> ownershipInfoList;
	public List<Product> productList;
	public List<ProductModel> productModelList;
	public List<SomeProducts> someProductsList;
	public List<Vehicle> vehicleList;

	public OWNS() {
	}

	public OWNS(String string) {
		this(new OWNERSHIP_INFO(string));
	}

	public String getString() {
		if(ownershipInfoList == null || ownershipInfoList.size() == 0 || ownershipInfoList.get(0) == null) {
			return null;
		} else {
			Name name = ownershipInfoList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(ownershipInfoList == null) {
			ownershipInfoList = new ArrayList<OwnershipInfo>();
		}
		if(ownershipInfoList.size() == 0) {
			ownershipInfoList.add(new OWNERSHIP_INFO(string));
		} else {
			ownershipInfoList.set(0, new OWNERSHIP_INFO(string));
		}
	}

	public OWNS(BusOrCoach busOrCoach) {
		busOrCoachList = new ArrayList<BusOrCoach>();
		busOrCoachList.add(busOrCoach);
	}

	@Override
	public BusOrCoach getBusOrCoach() {
		if(busOrCoachList != null && busOrCoachList.size() > 0) {
			return busOrCoachList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusOrCoach(BusOrCoach busOrCoach) {
		if(busOrCoachList == null) {
			busOrCoachList = new ArrayList<>();
		}
		if(busOrCoachList.size() == 0) {
			busOrCoachList.add(busOrCoach);
		} else {
			busOrCoachList.set(0, busOrCoach);
		}
	}

	@Override
	public List<BusOrCoach> getBusOrCoachList() {
		return busOrCoachList;
	}

	@Override
	public void setBusOrCoachList(List<BusOrCoach> busOrCoachList) {
		this.busOrCoachList = busOrCoachList;
	}

	@Override
	public boolean hasBusOrCoach() {
		return busOrCoachList != null && busOrCoachList.size() > 0 && busOrCoachList.get(0) != null;
	}

	public OWNS(Car car) {
		carList = new ArrayList<Car>();
		carList.add(car);
	}

	@Override
	public Car getCar() {
		if(carList != null && carList.size() > 0) {
			return carList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCar(Car car) {
		if(carList == null) {
			carList = new ArrayList<>();
		}
		if(carList.size() == 0) {
			carList.add(car);
		} else {
			carList.set(0, car);
		}
	}

	@Override
	public List<Car> getCarList() {
		return carList;
	}

	@Override
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	@Override
	public boolean hasCar() {
		return carList != null && carList.size() > 0 && carList.get(0) != null;
	}

	public OWNS(IndividualProduct individualProduct) {
		individualProductList = new ArrayList<IndividualProduct>();
		individualProductList.add(individualProduct);
	}

	@Override
	public IndividualProduct getIndividualProduct() {
		if(individualProductList != null && individualProductList.size() > 0) {
			return individualProductList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setIndividualProduct(IndividualProduct individualProduct) {
		if(individualProductList == null) {
			individualProductList = new ArrayList<>();
		}
		if(individualProductList.size() == 0) {
			individualProductList.add(individualProduct);
		} else {
			individualProductList.set(0, individualProduct);
		}
	}

	@Override
	public List<IndividualProduct> getIndividualProductList() {
		return individualProductList;
	}

	@Override
	public void setIndividualProductList(List<IndividualProduct> individualProductList) {
		this.individualProductList = individualProductList;
	}

	@Override
	public boolean hasIndividualProduct() {
		return individualProductList != null && individualProductList.size() > 0 && individualProductList.get(0) != null;
	}

	public OWNS(Motorcycle motorcycle) {
		motorcycleList = new ArrayList<Motorcycle>();
		motorcycleList.add(motorcycle);
	}

	@Override
	public Motorcycle getMotorcycle() {
		if(motorcycleList != null && motorcycleList.size() > 0) {
			return motorcycleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMotorcycle(Motorcycle motorcycle) {
		if(motorcycleList == null) {
			motorcycleList = new ArrayList<>();
		}
		if(motorcycleList.size() == 0) {
			motorcycleList.add(motorcycle);
		} else {
			motorcycleList.set(0, motorcycle);
		}
	}

	@Override
	public List<Motorcycle> getMotorcycleList() {
		return motorcycleList;
	}

	@Override
	public void setMotorcycleList(List<Motorcycle> motorcycleList) {
		this.motorcycleList = motorcycleList;
	}

	@Override
	public boolean hasMotorcycle() {
		return motorcycleList != null && motorcycleList.size() > 0 && motorcycleList.get(0) != null;
	}

	public OWNS(MotorizedBicycle motorizedBicycle) {
		motorizedBicycleList = new ArrayList<MotorizedBicycle>();
		motorizedBicycleList.add(motorizedBicycle);
	}

	@Override
	public MotorizedBicycle getMotorizedBicycle() {
		if(motorizedBicycleList != null && motorizedBicycleList.size() > 0) {
			return motorizedBicycleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMotorizedBicycle(MotorizedBicycle motorizedBicycle) {
		if(motorizedBicycleList == null) {
			motorizedBicycleList = new ArrayList<>();
		}
		if(motorizedBicycleList.size() == 0) {
			motorizedBicycleList.add(motorizedBicycle);
		} else {
			motorizedBicycleList.set(0, motorizedBicycle);
		}
	}

	@Override
	public List<MotorizedBicycle> getMotorizedBicycleList() {
		return motorizedBicycleList;
	}

	@Override
	public void setMotorizedBicycleList(List<MotorizedBicycle> motorizedBicycleList) {
		this.motorizedBicycleList = motorizedBicycleList;
	}

	@Override
	public boolean hasMotorizedBicycle() {
		return motorizedBicycleList != null && motorizedBicycleList.size() > 0 && motorizedBicycleList.get(0) != null;
	}

	public OWNS(OwnershipInfo ownershipInfo) {
		ownershipInfoList = new ArrayList<OwnershipInfo>();
		ownershipInfoList.add(ownershipInfo);
	}

	@Override
	public OwnershipInfo getOwnershipInfo() {
		if(ownershipInfoList != null && ownershipInfoList.size() > 0) {
			return ownershipInfoList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOwnershipInfo(OwnershipInfo ownershipInfo) {
		if(ownershipInfoList == null) {
			ownershipInfoList = new ArrayList<>();
		}
		if(ownershipInfoList.size() == 0) {
			ownershipInfoList.add(ownershipInfo);
		} else {
			ownershipInfoList.set(0, ownershipInfo);
		}
	}

	@Override
	public List<OwnershipInfo> getOwnershipInfoList() {
		return ownershipInfoList;
	}

	@Override
	public void setOwnershipInfoList(List<OwnershipInfo> ownershipInfoList) {
		this.ownershipInfoList = ownershipInfoList;
	}

	@Override
	public boolean hasOwnershipInfo() {
		return ownershipInfoList != null && ownershipInfoList.size() > 0 && ownershipInfoList.get(0) != null;
	}

	public OWNS(Product product) {
		productList = new ArrayList<Product>();
		productList.add(product);
	}

	@Override
	public Product getProduct() {
		if(productList != null && productList.size() > 0) {
			return productList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setProduct(Product product) {
		if(productList == null) {
			productList = new ArrayList<>();
		}
		if(productList.size() == 0) {
			productList.add(product);
		} else {
			productList.set(0, product);
		}
	}

	@Override
	public List<Product> getProductList() {
		return productList;
	}

	@Override
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@Override
	public boolean hasProduct() {
		return productList != null && productList.size() > 0 && productList.get(0) != null;
	}

	public OWNS(ProductModel productModel) {
		productModelList = new ArrayList<ProductModel>();
		productModelList.add(productModel);
	}

	@Override
	public ProductModel getProductModel() {
		if(productModelList != null && productModelList.size() > 0) {
			return productModelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setProductModel(ProductModel productModel) {
		if(productModelList == null) {
			productModelList = new ArrayList<>();
		}
		if(productModelList.size() == 0) {
			productModelList.add(productModel);
		} else {
			productModelList.set(0, productModel);
		}
	}

	@Override
	public List<ProductModel> getProductModelList() {
		return productModelList;
	}

	@Override
	public void setProductModelList(List<ProductModel> productModelList) {
		this.productModelList = productModelList;
	}

	@Override
	public boolean hasProductModel() {
		return productModelList != null && productModelList.size() > 0 && productModelList.get(0) != null;
	}

	public OWNS(SomeProducts someProducts) {
		someProductsList = new ArrayList<SomeProducts>();
		someProductsList.add(someProducts);
	}

	@Override
	public SomeProducts getSomeProducts() {
		if(someProductsList != null && someProductsList.size() > 0) {
			return someProductsList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSomeProducts(SomeProducts someProducts) {
		if(someProductsList == null) {
			someProductsList = new ArrayList<>();
		}
		if(someProductsList.size() == 0) {
			someProductsList.add(someProducts);
		} else {
			someProductsList.set(0, someProducts);
		}
	}

	@Override
	public List<SomeProducts> getSomeProductsList() {
		return someProductsList;
	}

	@Override
	public void setSomeProductsList(List<SomeProducts> someProductsList) {
		this.someProductsList = someProductsList;
	}

	@Override
	public boolean hasSomeProducts() {
		return someProductsList != null && someProductsList.size() > 0 && someProductsList.get(0) != null;
	}

	public OWNS(Vehicle vehicle) {
		vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(vehicle);
	}

	@Override
	public Vehicle getVehicle() {
		if(vehicleList != null && vehicleList.size() > 0) {
			return vehicleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVehicle(Vehicle vehicle) {
		if(vehicleList == null) {
			vehicleList = new ArrayList<>();
		}
		if(vehicleList.size() == 0) {
			vehicleList.add(vehicle);
		} else {
			vehicleList.set(0, vehicle);
		}
	}

	@Override
	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}

	@Override
	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	@Override
	public boolean hasVehicle() {
		return vehicleList != null && vehicleList.size() > 0 && vehicleList.get(0) != null;
	}

	public OWNS(List<BusOrCoach> busOrCoachList,
			List<Car> carList,
			List<IndividualProduct> individualProductList,
			List<Motorcycle> motorcycleList,
			List<MotorizedBicycle> motorizedBicycleList,
			List<OwnershipInfo> ownershipInfoList,
			List<Product> productList,
			List<ProductModel> productModelList,
			List<SomeProducts> someProductsList,
			List<Vehicle> vehicleList) {
		setBusOrCoachList(busOrCoachList);
		setCarList(carList);
		setIndividualProductList(individualProductList);
		setMotorcycleList(motorcycleList);
		setMotorizedBicycleList(motorizedBicycleList);
		setOwnershipInfoList(ownershipInfoList);
		setProductList(productList);
		setProductModelList(productModelList);
		setSomeProductsList(someProductsList);
		setVehicleList(vehicleList);
	}

	public void copy(Container.Owns org) {
		setBusOrCoachList(org.getBusOrCoachList());
		setCarList(org.getCarList());
		setIndividualProductList(org.getIndividualProductList());
		setMotorcycleList(org.getMotorcycleList());
		setMotorizedBicycleList(org.getMotorizedBicycleList());
		setOwnershipInfoList(org.getOwnershipInfoList());
		setProductList(org.getProductList());
		setProductModelList(org.getProductModelList());
		setSomeProductsList(org.getSomeProductsList());
		setVehicleList(org.getVehicleList());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
