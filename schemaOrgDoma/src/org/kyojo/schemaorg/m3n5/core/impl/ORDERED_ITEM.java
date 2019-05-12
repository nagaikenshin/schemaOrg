package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.auto.Clazz.BusOrCoach;
import org.kyojo.schemaorg.m3n5.auto.Clazz.Motorcycle;
import org.kyojo.schemaorg.m3n5.auto.Clazz.MotorizedBicycle;
import org.kyojo.schemaorg.m3n5.core.Clazz.Car;
import org.kyojo.schemaorg.m3n5.core.Clazz.IndividualProduct;
import org.kyojo.schemaorg.m3n5.core.Clazz.OrderItem;
import org.kyojo.schemaorg.m3n5.core.Clazz.Product;
import org.kyojo.schemaorg.m3n5.core.Clazz.ProductModel;
import org.kyojo.schemaorg.m3n5.core.Clazz.SomeProducts;
import org.kyojo.schemaorg.m3n5.core.Clazz.Vehicle;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

import org.seasar.doma.Transient;

public class ORDERED_ITEM implements Container.OrderedItem {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<BusOrCoach> busOrCoachList;
	@Transient
	public List<Car> carList;
	@Transient
	public List<IndividualProduct> individualProductList;
	@Transient
	public List<Motorcycle> motorcycleList;
	@Transient
	public List<MotorizedBicycle> motorizedBicycleList;
	@Transient
	public List<OrderItem> orderItemList;
	@Transient
	public List<Product> productList;
	@Transient
	public List<ProductModel> productModelList;
	@Transient
	public List<SomeProducts> someProductsList;
	@Transient
	public List<Vehicle> vehicleList;

	public ORDERED_ITEM() {
	}

	public ORDERED_ITEM(String string) {
		this(new ORDER_ITEM(string));
	}

	public String getString() {
		if(orderItemList == null || orderItemList.size() == 0 || orderItemList.get(0) == null) {
			return null;
		} else {
			Name name = orderItemList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(orderItemList == null) {
			orderItemList = new ArrayList<OrderItem>();
		}
		if(orderItemList.size() == 0) {
			orderItemList.add(new ORDER_ITEM(string));
		} else {
			orderItemList.set(0, new ORDER_ITEM(string));
		}
	}

	public ORDERED_ITEM(BusOrCoach busOrCoach) {
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

	public ORDERED_ITEM(Car car) {
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

	public ORDERED_ITEM(IndividualProduct individualProduct) {
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

	public ORDERED_ITEM(Motorcycle motorcycle) {
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

	public ORDERED_ITEM(MotorizedBicycle motorizedBicycle) {
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

	public ORDERED_ITEM(OrderItem orderItem) {
		orderItemList = new ArrayList<OrderItem>();
		orderItemList.add(orderItem);
	}

	@Override
	public OrderItem getOrderItem() {
		if(orderItemList != null && orderItemList.size() > 0) {
			return orderItemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOrderItem(OrderItem orderItem) {
		if(orderItemList == null) {
			orderItemList = new ArrayList<>();
		}
		if(orderItemList.size() == 0) {
			orderItemList.add(orderItem);
		} else {
			orderItemList.set(0, orderItem);
		}
	}

	@Override
	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	@Override
	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	@Override
	public boolean hasOrderItem() {
		return orderItemList != null && orderItemList.size() > 0 && orderItemList.get(0) != null;
	}

	public ORDERED_ITEM(Product product) {
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

	public ORDERED_ITEM(ProductModel productModel) {
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

	public ORDERED_ITEM(SomeProducts someProducts) {
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

	public ORDERED_ITEM(Vehicle vehicle) {
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

	public ORDERED_ITEM(List<BusOrCoach> busOrCoachList,
			List<Car> carList,
			List<IndividualProduct> individualProductList,
			List<Motorcycle> motorcycleList,
			List<MotorizedBicycle> motorizedBicycleList,
			List<OrderItem> orderItemList,
			List<Product> productList,
			List<ProductModel> productModelList,
			List<SomeProducts> someProductsList,
			List<Vehicle> vehicleList) {
		setBusOrCoachList(busOrCoachList);
		setCarList(carList);
		setIndividualProductList(individualProductList);
		setMotorcycleList(motorcycleList);
		setMotorizedBicycleList(motorizedBicycleList);
		setOrderItemList(orderItemList);
		setProductList(productList);
		setProductModelList(productModelList);
		setSomeProductsList(someProductsList);
		setVehicleList(vehicleList);
	}

	public void copy(Container.OrderedItem org) {
		setBusOrCoachList(org.getBusOrCoachList());
		setCarList(org.getCarList());
		setIndividualProductList(org.getIndividualProductList());
		setMotorcycleList(org.getMotorcycleList());
		setMotorizedBicycleList(org.getMotorizedBicycleList());
		setOrderItemList(org.getOrderItemList());
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
