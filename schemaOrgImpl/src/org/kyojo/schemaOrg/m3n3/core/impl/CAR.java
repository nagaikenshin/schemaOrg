package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.auto.Container.AccelerationTime;
import org.kyojo.schemaOrg.m3n3.auto.Container.AcrissCode;
import org.kyojo.schemaOrg.m3n3.auto.Container.BodyType;
import org.kyojo.schemaOrg.m3n3.auto.Container.EmissionsCO2;
import org.kyojo.schemaOrg.m3n3.auto.Container.FuelCapacity;
import org.kyojo.schemaOrg.m3n3.auto.Container.MeetsEmissionStandard;
import org.kyojo.schemaOrg.m3n3.auto.Container.ModelDate;
import org.kyojo.schemaOrg.m3n3.auto.Container.Payload;
import org.kyojo.schemaOrg.m3n3.auto.Container.RoofLoad;
import org.kyojo.schemaOrg.m3n3.auto.Container.SeatingCapacity;
import org.kyojo.schemaOrg.m3n3.auto.Container.Speed;
import org.kyojo.schemaOrg.m3n3.auto.Container.TongueWeight;
import org.kyojo.schemaOrg.m3n3.auto.Container.TrailerWeight;
import org.kyojo.schemaOrg.m3n3.auto.Container.VehicleSpecialUsage;
import org.kyojo.schemaOrg.m3n3.auto.Container.WeightTotal;
import org.kyojo.schemaOrg.m3n3.auto.Container.Wheelbase;
import org.kyojo.schemaOrg.m3n3.core.Clazz;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalProperty;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaOrg.m3n3.core.Container.AggregateRating;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaOrg.m3n3.core.Container.Audience;
import org.kyojo.schemaOrg.m3n3.core.Container.Award;
import org.kyojo.schemaOrg.m3n3.core.Container.Brand;
import org.kyojo.schemaOrg.m3n3.core.Container.CargoVolume;
import org.kyojo.schemaOrg.m3n3.core.Container.Category;
import org.kyojo.schemaOrg.m3n3.core.Container.Color;
import org.kyojo.schemaOrg.m3n3.core.Container.DateVehicleFirstRegistered;
import org.kyojo.schemaOrg.m3n3.core.Container.Depth;
import org.kyojo.schemaOrg.m3n3.core.Container.Description;
import org.kyojo.schemaOrg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaOrg.m3n3.core.Container.DriveWheelConfiguration;
import org.kyojo.schemaOrg.m3n3.core.Container.FuelConsumption;
import org.kyojo.schemaOrg.m3n3.core.Container.FuelEfficiency;
import org.kyojo.schemaOrg.m3n3.core.Container.FuelType;
import org.kyojo.schemaOrg.m3n3.core.Container.Gtin12;
import org.kyojo.schemaOrg.m3n3.core.Container.Gtin13;
import org.kyojo.schemaOrg.m3n3.core.Container.Gtin14;
import org.kyojo.schemaOrg.m3n3.core.Container.Gtin8;
import org.kyojo.schemaOrg.m3n3.core.Container.Height;
import org.kyojo.schemaOrg.m3n3.core.Container.Identifier;
import org.kyojo.schemaOrg.m3n3.core.Container.Image;
import org.kyojo.schemaOrg.m3n3.core.Container.IsAccessoryOrSparePartFor;
import org.kyojo.schemaOrg.m3n3.core.Container.IsConsumableFor;
import org.kyojo.schemaOrg.m3n3.core.Container.IsRelatedTo;
import org.kyojo.schemaOrg.m3n3.core.Container.IsSimilarTo;
import org.kyojo.schemaOrg.m3n3.core.Container.ItemCondition;
import org.kyojo.schemaOrg.m3n3.core.Container.KnownVehicleDamages;
import org.kyojo.schemaOrg.m3n3.core.Container.Logo;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaOrg.m3n3.core.Container.Manufacturer;
import org.kyojo.schemaOrg.m3n3.core.Container.Material;
import org.kyojo.schemaOrg.m3n3.core.Container.MileageFromOdometer;
import org.kyojo.schemaOrg.m3n3.core.Container.Model;
import org.kyojo.schemaOrg.m3n3.core.Container.Mpn;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaOrg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaOrg.m3n3.core.Container.NumberOfAirbags;
import org.kyojo.schemaOrg.m3n3.core.Container.NumberOfAxles;
import org.kyojo.schemaOrg.m3n3.core.Container.NumberOfDoors;
import org.kyojo.schemaOrg.m3n3.core.Container.NumberOfForwardGears;
import org.kyojo.schemaOrg.m3n3.core.Container.NumberOfPreviousOwners;
import org.kyojo.schemaOrg.m3n3.core.Container.Offers;
import org.kyojo.schemaOrg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaOrg.m3n3.core.Container.ProductID;
import org.kyojo.schemaOrg.m3n3.core.Container.ProductionDate;
import org.kyojo.schemaOrg.m3n3.core.Container.PurchaseDate;
import org.kyojo.schemaOrg.m3n3.core.Container.ReleaseDate;
import org.kyojo.schemaOrg.m3n3.core.Container.Review;
import org.kyojo.schemaOrg.m3n3.core.Container.SameAs;
import org.kyojo.schemaOrg.m3n3.core.Container.Sku;
import org.kyojo.schemaOrg.m3n3.core.Container.SteeringPosition;
import org.kyojo.schemaOrg.m3n3.core.Container.Url;
import org.kyojo.schemaOrg.m3n3.core.Container.VehicleConfiguration;
import org.kyojo.schemaOrg.m3n3.core.Container.VehicleEngine;
import org.kyojo.schemaOrg.m3n3.core.Container.VehicleIdentificationNumber;
import org.kyojo.schemaOrg.m3n3.core.Container.VehicleInteriorColor;
import org.kyojo.schemaOrg.m3n3.core.Container.VehicleInteriorType;
import org.kyojo.schemaOrg.m3n3.core.Container.VehicleModelDate;
import org.kyojo.schemaOrg.m3n3.core.Container.VehicleSeatingCapacity;
import org.kyojo.schemaOrg.m3n3.core.Container.VehicleTransmission;
import org.kyojo.schemaOrg.m3n3.core.Container.Weight;
import org.kyojo.schemaOrg.m3n3.core.Container.Width;
import org.kyojo.schemaOrg.m3n3.core.DataType;
import org.kyojo.schemaOrg.m3n3.core.impl.NAME;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;

public class CAR implements Clazz.Car {

	private static final long serialVersionUID = 1L;

	public Long seq;
	public Long refSeq;
	public String refAcr;
	public java.util.Date createdAt;
	public Long createdBy;
	public java.util.Date updatedAt;
	public Long updatedBy;
	public java.util.Date expiredAt;
	public Long expiredBy;
	public AccelerationTime accelerationTime;
	public AcrissCode acrissCode;
	public AdditionalProperty additionalProperty;
	public AdditionalType additionalType;
	public AggregateRating aggregateRating;
	public AlternateName alternateName;
	public Audience audience;
	public Award award;
	public BodyType bodyType;
	public Brand brand;
	public CargoVolume cargoVolume;
	public Category category;
	public Color color;
	public DateVehicleFirstRegistered dateVehicleFirstRegistered;
	public Depth depth;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public DriveWheelConfiguration driveWheelConfiguration;
	public EmissionsCO2 emissionsCO2;
	public FuelCapacity fuelCapacity;
	public FuelConsumption fuelConsumption;
	public FuelEfficiency fuelEfficiency;
	public FuelType fuelType;
	public Gtin12 gtin12;
	public Gtin13 gtin13;
	public Gtin14 gtin14;
	public Gtin8 gtin8;
	public Height height;
	public Identifier identifier;
	public Image image;
	public IsAccessoryOrSparePartFor isAccessoryOrSparePartFor;
	public IsConsumableFor isConsumableFor;
	public IsRelatedTo isRelatedTo;
	public IsSimilarTo isSimilarTo;
	public ItemCondition itemCondition;
	public KnownVehicleDamages knownVehicleDamages;
	public Logo logo;
	public MainEntityOfPage mainEntityOfPage;
	public Manufacturer manufacturer;
	public Material material;
	public MeetsEmissionStandard meetsEmissionStandard;
	public MileageFromOdometer mileageFromOdometer;
	public Model model;
	public ModelDate modelDate;
	public Mpn mpn;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public NumberOfAirbags numberOfAirbags;
	public NumberOfAxles numberOfAxles;
	public NumberOfDoors numberOfDoors;
	public NumberOfForwardGears numberOfForwardGears;
	public NumberOfPreviousOwners numberOfPreviousOwners;
	public Offers offers;
	public Payload payload;
	public PotentialAction potentialAction;
	public ProductID productID;
	public ProductionDate productionDate;
	public PurchaseDate purchaseDate;
	public ReleaseDate releaseDate;
	public Review review;
	public RoofLoad roofLoad;
	public SameAs sameAs;
	public SeatingCapacity seatingCapacity;
	public Sku sku;
	public Speed speed;
	public SteeringPosition steeringPosition;
	public TongueWeight tongueWeight;
	public TrailerWeight trailerWeight;
	public Url url;
	public VehicleConfiguration vehicleConfiguration;
	public VehicleEngine vehicleEngine;
	public VehicleIdentificationNumber vehicleIdentificationNumber;
	public VehicleInteriorColor vehicleInteriorColor;
	public VehicleInteriorType vehicleInteriorType;
	public VehicleModelDate vehicleModelDate;
	public VehicleSeatingCapacity vehicleSeatingCapacity;
	public VehicleSpecialUsage vehicleSpecialUsage;
	public VehicleTransmission vehicleTransmission;
	public Weight weight;
	public WeightTotal weightTotal;
	public Wheelbase wheelbase;
	public Width width;

	public CAR() {
	}

	public CAR(Long seq) {
		setSeq(seq);
	}

	public CAR(String string) {
		setName(new NAME(new TEXT(string)));
	}

	@Override
	public String getString() {
		if(name == null) return null;

		List<DataType.Text> textList = name.getTextList();
		if(textList == null || textList.size() == 0 || textList.get(0) == null) {
			return null;
		} else {
			return textList.get(0).getString();
		}
	}

	@Override
	public void setString(String string) {
		if(name == null) name = new NAME();

		List<DataType.Text> textList = name.getTextList();
		if(textList == null) {
			textList = new ArrayList<DataType.Text>();
			name.setTextList(textList);
		}
		if(textList.size() == 0) {
			textList.add(new TEXT(string));
		} else {
			textList.set(0, new TEXT(string));
		}
	}

	public CAR(AccelerationTime accelerationTime) {
		setAccelerationTime(accelerationTime);
	}

	@Override
	public AccelerationTime getAccelerationTime() {
		return accelerationTime;
	}

	@Override
	public void setAccelerationTime(AccelerationTime accelerationTime) {
		this.accelerationTime = accelerationTime;
	}

	public CAR(AcrissCode acrissCode) {
		setAcrissCode(acrissCode);
	}

	@Override
	public AcrissCode getAcrissCode() {
		return acrissCode;
	}

	@Override
	public void setAcrissCode(AcrissCode acrissCode) {
		this.acrissCode = acrissCode;
	}

	public CAR(AdditionalProperty additionalProperty) {
		setAdditionalProperty(additionalProperty);
	}

	@Override
	public AdditionalProperty getAdditionalProperty() {
		return additionalProperty;
	}

	@Override
	public void setAdditionalProperty(AdditionalProperty additionalProperty) {
		this.additionalProperty = additionalProperty;
	}

	public CAR(AdditionalType additionalType) {
		setAdditionalType(additionalType);
	}

	@Override
	public AdditionalType getAdditionalType() {
		return additionalType;
	}

	@Override
	public void setAdditionalType(AdditionalType additionalType) {
		this.additionalType = additionalType;
	}

	public CAR(AggregateRating aggregateRating) {
		setAggregateRating(aggregateRating);
	}

	@Override
	public AggregateRating getAggregateRating() {
		return aggregateRating;
	}

	@Override
	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	public CAR(AlternateName alternateName) {
		setAlternateName(alternateName);
	}

	@Override
	public AlternateName getAlternateName() {
		return alternateName;
	}

	@Override
	public void setAlternateName(AlternateName alternateName) {
		this.alternateName = alternateName;
	}

	public CAR(Audience audience) {
		setAudience(audience);
	}

	@Override
	public Audience getAudience() {
		return audience;
	}

	@Override
	public void setAudience(Audience audience) {
		this.audience = audience;
	}

	public CAR(Award award) {
		setAward(award);
	}

	@Override
	public Award getAward() {
		return award;
	}

	@Override
	public void setAward(Award award) {
		this.award = award;
	}

	public CAR(BodyType bodyType) {
		setBodyType(bodyType);
	}

	@Override
	public BodyType getBodyType() {
		return bodyType;
	}

	@Override
	public void setBodyType(BodyType bodyType) {
		this.bodyType = bodyType;
	}

	public CAR(Brand brand) {
		setBrand(brand);
	}

	@Override
	public Brand getBrand() {
		return brand;
	}

	@Override
	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public CAR(CargoVolume cargoVolume) {
		setCargoVolume(cargoVolume);
	}

	@Override
	public CargoVolume getCargoVolume() {
		return cargoVolume;
	}

	@Override
	public void setCargoVolume(CargoVolume cargoVolume) {
		this.cargoVolume = cargoVolume;
	}

	public CAR(Category category) {
		setCategory(category);
	}

	@Override
	public Category getCategory() {
		return category;
	}

	@Override
	public void setCategory(Category category) {
		this.category = category;
	}

	public CAR(Color color) {
		setColor(color);
	}

	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
	}

	public CAR(DateVehicleFirstRegistered dateVehicleFirstRegistered) {
		setDateVehicleFirstRegistered(dateVehicleFirstRegistered);
	}

	@Override
	public DateVehicleFirstRegistered getDateVehicleFirstRegistered() {
		return dateVehicleFirstRegistered;
	}

	@Override
	public void setDateVehicleFirstRegistered(DateVehicleFirstRegistered dateVehicleFirstRegistered) {
		this.dateVehicleFirstRegistered = dateVehicleFirstRegistered;
	}

	public CAR(Depth depth) {
		setDepth(depth);
	}

	@Override
	public Depth getDepth() {
		return depth;
	}

	@Override
	public void setDepth(Depth depth) {
		this.depth = depth;
	}

	public CAR(Description description) {
		setDescription(description);
	}

	@Override
	public Description getDescription() {
		return description;
	}

	@Override
	public void setDescription(Description description) {
		this.description = description;
	}

	public CAR(DisambiguatingDescription disambiguatingDescription) {
		setDisambiguatingDescription(disambiguatingDescription);
	}

	@Override
	public DisambiguatingDescription getDisambiguatingDescription() {
		return disambiguatingDescription;
	}

	@Override
	public void setDisambiguatingDescription(DisambiguatingDescription disambiguatingDescription) {
		this.disambiguatingDescription = disambiguatingDescription;
	}

	public CAR(DriveWheelConfiguration driveWheelConfiguration) {
		setDriveWheelConfiguration(driveWheelConfiguration);
	}

	@Override
	public DriveWheelConfiguration getDriveWheelConfiguration() {
		return driveWheelConfiguration;
	}

	@Override
	public void setDriveWheelConfiguration(DriveWheelConfiguration driveWheelConfiguration) {
		this.driveWheelConfiguration = driveWheelConfiguration;
	}

	public CAR(EmissionsCO2 emissionsCO2) {
		setEmissionsCO2(emissionsCO2);
	}

	@Override
	public EmissionsCO2 getEmissionsCO2() {
		return emissionsCO2;
	}

	@Override
	public void setEmissionsCO2(EmissionsCO2 emissionsCO2) {
		this.emissionsCO2 = emissionsCO2;
	}

	public CAR(FuelCapacity fuelCapacity) {
		setFuelCapacity(fuelCapacity);
	}

	@Override
	public FuelCapacity getFuelCapacity() {
		return fuelCapacity;
	}

	@Override
	public void setFuelCapacity(FuelCapacity fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public CAR(FuelConsumption fuelConsumption) {
		setFuelConsumption(fuelConsumption);
	}

	@Override
	public FuelConsumption getFuelConsumption() {
		return fuelConsumption;
	}

	@Override
	public void setFuelConsumption(FuelConsumption fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public CAR(FuelEfficiency fuelEfficiency) {
		setFuelEfficiency(fuelEfficiency);
	}

	@Override
	public FuelEfficiency getFuelEfficiency() {
		return fuelEfficiency;
	}

	@Override
	public void setFuelEfficiency(FuelEfficiency fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}

	public CAR(FuelType fuelType) {
		setFuelType(fuelType);
	}

	@Override
	public FuelType getFuelType() {
		return fuelType;
	}

	@Override
	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	public CAR(Gtin12 gtin12) {
		setGtin12(gtin12);
	}

	@Override
	public Gtin12 getGtin12() {
		return gtin12;
	}

	@Override
	public void setGtin12(Gtin12 gtin12) {
		this.gtin12 = gtin12;
	}

	public CAR(Gtin13 gtin13) {
		setGtin13(gtin13);
	}

	@Override
	public Gtin13 getGtin13() {
		return gtin13;
	}

	@Override
	public void setGtin13(Gtin13 gtin13) {
		this.gtin13 = gtin13;
	}

	public CAR(Gtin14 gtin14) {
		setGtin14(gtin14);
	}

	@Override
	public Gtin14 getGtin14() {
		return gtin14;
	}

	@Override
	public void setGtin14(Gtin14 gtin14) {
		this.gtin14 = gtin14;
	}

	public CAR(Gtin8 gtin8) {
		setGtin8(gtin8);
	}

	@Override
	public Gtin8 getGtin8() {
		return gtin8;
	}

	@Override
	public void setGtin8(Gtin8 gtin8) {
		this.gtin8 = gtin8;
	}

	public CAR(Height height) {
		setHeight(height);
	}

	@Override
	public Height getHeight() {
		return height;
	}

	@Override
	public void setHeight(Height height) {
		this.height = height;
	}

	public CAR(Identifier identifier) {
		setIdentifier(identifier);
	}

	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	@Override
	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}

	public CAR(Image image) {
		setImage(image);
	}

	@Override
	public Image getImage() {
		return image;
	}

	@Override
	public void setImage(Image image) {
		this.image = image;
	}

	public CAR(IsAccessoryOrSparePartFor isAccessoryOrSparePartFor) {
		setIsAccessoryOrSparePartFor(isAccessoryOrSparePartFor);
	}

	@Override
	public IsAccessoryOrSparePartFor getIsAccessoryOrSparePartFor() {
		return isAccessoryOrSparePartFor;
	}

	@Override
	public void setIsAccessoryOrSparePartFor(IsAccessoryOrSparePartFor isAccessoryOrSparePartFor) {
		this.isAccessoryOrSparePartFor = isAccessoryOrSparePartFor;
	}

	public CAR(IsConsumableFor isConsumableFor) {
		setIsConsumableFor(isConsumableFor);
	}

	@Override
	public IsConsumableFor getIsConsumableFor() {
		return isConsumableFor;
	}

	@Override
	public void setIsConsumableFor(IsConsumableFor isConsumableFor) {
		this.isConsumableFor = isConsumableFor;
	}

	public CAR(IsRelatedTo isRelatedTo) {
		setIsRelatedTo(isRelatedTo);
	}

	@Override
	public IsRelatedTo getIsRelatedTo() {
		return isRelatedTo;
	}

	@Override
	public void setIsRelatedTo(IsRelatedTo isRelatedTo) {
		this.isRelatedTo = isRelatedTo;
	}

	public CAR(IsSimilarTo isSimilarTo) {
		setIsSimilarTo(isSimilarTo);
	}

	@Override
	public IsSimilarTo getIsSimilarTo() {
		return isSimilarTo;
	}

	@Override
	public void setIsSimilarTo(IsSimilarTo isSimilarTo) {
		this.isSimilarTo = isSimilarTo;
	}

	public CAR(ItemCondition itemCondition) {
		setItemCondition(itemCondition);
	}

	@Override
	public ItemCondition getItemCondition() {
		return itemCondition;
	}

	@Override
	public void setItemCondition(ItemCondition itemCondition) {
		this.itemCondition = itemCondition;
	}

	public CAR(KnownVehicleDamages knownVehicleDamages) {
		setKnownVehicleDamages(knownVehicleDamages);
	}

	@Override
	public KnownVehicleDamages getKnownVehicleDamages() {
		return knownVehicleDamages;
	}

	@Override
	public void setKnownVehicleDamages(KnownVehicleDamages knownVehicleDamages) {
		this.knownVehicleDamages = knownVehicleDamages;
	}

	public CAR(Logo logo) {
		setLogo(logo);
	}

	@Override
	public Logo getLogo() {
		return logo;
	}

	@Override
	public void setLogo(Logo logo) {
		this.logo = logo;
	}

	public CAR(MainEntityOfPage mainEntityOfPage) {
		setMainEntityOfPage(mainEntityOfPage);
	}

	@Override
	public MainEntityOfPage getMainEntityOfPage() {
		return mainEntityOfPage;
	}

	@Override
	public void setMainEntityOfPage(MainEntityOfPage mainEntityOfPage) {
		this.mainEntityOfPage = mainEntityOfPage;
	}

	public CAR(Manufacturer manufacturer) {
		setManufacturer(manufacturer);
	}

	@Override
	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	@Override
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public CAR(Material material) {
		setMaterial(material);
	}

	@Override
	public Material getMaterial() {
		return material;
	}

	@Override
	public void setMaterial(Material material) {
		this.material = material;
	}

	public CAR(MeetsEmissionStandard meetsEmissionStandard) {
		setMeetsEmissionStandard(meetsEmissionStandard);
	}

	@Override
	public MeetsEmissionStandard getMeetsEmissionStandard() {
		return meetsEmissionStandard;
	}

	@Override
	public void setMeetsEmissionStandard(MeetsEmissionStandard meetsEmissionStandard) {
		this.meetsEmissionStandard = meetsEmissionStandard;
	}

	public CAR(MileageFromOdometer mileageFromOdometer) {
		setMileageFromOdometer(mileageFromOdometer);
	}

	@Override
	public MileageFromOdometer getMileageFromOdometer() {
		return mileageFromOdometer;
	}

	@Override
	public void setMileageFromOdometer(MileageFromOdometer mileageFromOdometer) {
		this.mileageFromOdometer = mileageFromOdometer;
	}

	public CAR(Model model) {
		setModel(model);
	}

	@Override
	public Model getModel() {
		return model;
	}

	@Override
	public void setModel(Model model) {
		this.model = model;
	}

	public CAR(ModelDate modelDate) {
		setModelDate(modelDate);
	}

	@Override
	public ModelDate getModelDate() {
		return modelDate;
	}

	@Override
	public void setModelDate(ModelDate modelDate) {
		this.modelDate = modelDate;
	}

	public CAR(Mpn mpn) {
		setMpn(mpn);
	}

	@Override
	public Mpn getMpn() {
		return mpn;
	}

	@Override
	public void setMpn(Mpn mpn) {
		this.mpn = mpn;
	}

	public CAR(Name name) {
		setName(name);
	}

	@Override
	public Name getName() {
		return name;
	}

	@Override
	public void setName(Name name) {
		this.name = name;
	}

	public CAR(NameFuzzy nameFuzzy) {
		setNameFuzzy(nameFuzzy);
	}

	@Override
	public NameFuzzy getNameFuzzy() {
		return nameFuzzy;
	}

	@Override
	public void setNameFuzzy(NameFuzzy nameFuzzy) {
		this.nameFuzzy = nameFuzzy;
	}

	public CAR(NameRuby nameRuby) {
		setNameRuby(nameRuby);
	}

	@Override
	public NameRuby getNameRuby() {
		return nameRuby;
	}

	@Override
	public void setNameRuby(NameRuby nameRuby) {
		this.nameRuby = nameRuby;
	}

	public CAR(NumberOfAirbags numberOfAirbags) {
		setNumberOfAirbags(numberOfAirbags);
	}

	@Override
	public NumberOfAirbags getNumberOfAirbags() {
		return numberOfAirbags;
	}

	@Override
	public void setNumberOfAirbags(NumberOfAirbags numberOfAirbags) {
		this.numberOfAirbags = numberOfAirbags;
	}

	public CAR(NumberOfAxles numberOfAxles) {
		setNumberOfAxles(numberOfAxles);
	}

	@Override
	public NumberOfAxles getNumberOfAxles() {
		return numberOfAxles;
	}

	@Override
	public void setNumberOfAxles(NumberOfAxles numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}

	public CAR(NumberOfDoors numberOfDoors) {
		setNumberOfDoors(numberOfDoors);
	}

	@Override
	public NumberOfDoors getNumberOfDoors() {
		return numberOfDoors;
	}

	@Override
	public void setNumberOfDoors(NumberOfDoors numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public CAR(NumberOfForwardGears numberOfForwardGears) {
		setNumberOfForwardGears(numberOfForwardGears);
	}

	@Override
	public NumberOfForwardGears getNumberOfForwardGears() {
		return numberOfForwardGears;
	}

	@Override
	public void setNumberOfForwardGears(NumberOfForwardGears numberOfForwardGears) {
		this.numberOfForwardGears = numberOfForwardGears;
	}

	public CAR(NumberOfPreviousOwners numberOfPreviousOwners) {
		setNumberOfPreviousOwners(numberOfPreviousOwners);
	}

	@Override
	public NumberOfPreviousOwners getNumberOfPreviousOwners() {
		return numberOfPreviousOwners;
	}

	@Override
	public void setNumberOfPreviousOwners(NumberOfPreviousOwners numberOfPreviousOwners) {
		this.numberOfPreviousOwners = numberOfPreviousOwners;
	}

	public CAR(Offers offers) {
		setOffers(offers);
	}

	@Override
	public Offers getOffers() {
		return offers;
	}

	@Override
	public void setOffers(Offers offers) {
		this.offers = offers;
	}

	public CAR(Payload payload) {
		setPayload(payload);
	}

	@Override
	public Payload getPayload() {
		return payload;
	}

	@Override
	public void setPayload(Payload payload) {
		this.payload = payload;
	}

	public CAR(PotentialAction potentialAction) {
		setPotentialAction(potentialAction);
	}

	@Override
	public PotentialAction getPotentialAction() {
		return potentialAction;
	}

	@Override
	public void setPotentialAction(PotentialAction potentialAction) {
		this.potentialAction = potentialAction;
	}

	public CAR(ProductID productID) {
		setProductID(productID);
	}

	@Override
	public ProductID getProductID() {
		return productID;
	}

	@Override
	public void setProductID(ProductID productID) {
		this.productID = productID;
	}

	public CAR(ProductionDate productionDate) {
		setProductionDate(productionDate);
	}

	@Override
	public ProductionDate getProductionDate() {
		return productionDate;
	}

	@Override
	public void setProductionDate(ProductionDate productionDate) {
		this.productionDate = productionDate;
	}

	public CAR(PurchaseDate purchaseDate) {
		setPurchaseDate(purchaseDate);
	}

	@Override
	public PurchaseDate getPurchaseDate() {
		return purchaseDate;
	}

	@Override
	public void setPurchaseDate(PurchaseDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public CAR(ReleaseDate releaseDate) {
		setReleaseDate(releaseDate);
	}

	@Override
	public ReleaseDate getReleaseDate() {
		return releaseDate;
	}

	@Override
	public void setReleaseDate(ReleaseDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public CAR(Review review) {
		setReview(review);
	}

	@Override
	public Review getReview() {
		return review;
	}

	@Override
	public void setReview(Review review) {
		this.review = review;
	}

	public CAR(RoofLoad roofLoad) {
		setRoofLoad(roofLoad);
	}

	@Override
	public RoofLoad getRoofLoad() {
		return roofLoad;
	}

	@Override
	public void setRoofLoad(RoofLoad roofLoad) {
		this.roofLoad = roofLoad;
	}

	public CAR(SameAs sameAs) {
		setSameAs(sameAs);
	}

	@Override
	public SameAs getSameAs() {
		return sameAs;
	}

	@Override
	public void setSameAs(SameAs sameAs) {
		this.sameAs = sameAs;
	}

	public CAR(SeatingCapacity seatingCapacity) {
		setSeatingCapacity(seatingCapacity);
	}

	@Override
	public SeatingCapacity getSeatingCapacity() {
		return seatingCapacity;
	}

	@Override
	public void setSeatingCapacity(SeatingCapacity seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public CAR(Sku sku) {
		setSku(sku);
	}

	@Override
	public Sku getSku() {
		return sku;
	}

	@Override
	public void setSku(Sku sku) {
		this.sku = sku;
	}

	public CAR(Speed speed) {
		setSpeed(speed);
	}

	@Override
	public Speed getSpeed() {
		return speed;
	}

	@Override
	public void setSpeed(Speed speed) {
		this.speed = speed;
	}

	public CAR(SteeringPosition steeringPosition) {
		setSteeringPosition(steeringPosition);
	}

	@Override
	public SteeringPosition getSteeringPosition() {
		return steeringPosition;
	}

	@Override
	public void setSteeringPosition(SteeringPosition steeringPosition) {
		this.steeringPosition = steeringPosition;
	}

	public CAR(TongueWeight tongueWeight) {
		setTongueWeight(tongueWeight);
	}

	@Override
	public TongueWeight getTongueWeight() {
		return tongueWeight;
	}

	@Override
	public void setTongueWeight(TongueWeight tongueWeight) {
		this.tongueWeight = tongueWeight;
	}

	public CAR(TrailerWeight trailerWeight) {
		setTrailerWeight(trailerWeight);
	}

	@Override
	public TrailerWeight getTrailerWeight() {
		return trailerWeight;
	}

	@Override
	public void setTrailerWeight(TrailerWeight trailerWeight) {
		this.trailerWeight = trailerWeight;
	}

	public CAR(Url url) {
		setUrl(url);
	}

	@Override
	public Url getUrl() {
		return url;
	}

	@Override
	public void setUrl(Url url) {
		this.url = url;
	}

	public CAR(VehicleConfiguration vehicleConfiguration) {
		setVehicleConfiguration(vehicleConfiguration);
	}

	@Override
	public VehicleConfiguration getVehicleConfiguration() {
		return vehicleConfiguration;
	}

	@Override
	public void setVehicleConfiguration(VehicleConfiguration vehicleConfiguration) {
		this.vehicleConfiguration = vehicleConfiguration;
	}

	public CAR(VehicleEngine vehicleEngine) {
		setVehicleEngine(vehicleEngine);
	}

	@Override
	public VehicleEngine getVehicleEngine() {
		return vehicleEngine;
	}

	@Override
	public void setVehicleEngine(VehicleEngine vehicleEngine) {
		this.vehicleEngine = vehicleEngine;
	}

	public CAR(VehicleIdentificationNumber vehicleIdentificationNumber) {
		setVehicleIdentificationNumber(vehicleIdentificationNumber);
	}

	@Override
	public VehicleIdentificationNumber getVehicleIdentificationNumber() {
		return vehicleIdentificationNumber;
	}

	@Override
	public void setVehicleIdentificationNumber(VehicleIdentificationNumber vehicleIdentificationNumber) {
		this.vehicleIdentificationNumber = vehicleIdentificationNumber;
	}

	public CAR(VehicleInteriorColor vehicleInteriorColor) {
		setVehicleInteriorColor(vehicleInteriorColor);
	}

	@Override
	public VehicleInteriorColor getVehicleInteriorColor() {
		return vehicleInteriorColor;
	}

	@Override
	public void setVehicleInteriorColor(VehicleInteriorColor vehicleInteriorColor) {
		this.vehicleInteriorColor = vehicleInteriorColor;
	}

	public CAR(VehicleInteriorType vehicleInteriorType) {
		setVehicleInteriorType(vehicleInteriorType);
	}

	@Override
	public VehicleInteriorType getVehicleInteriorType() {
		return vehicleInteriorType;
	}

	@Override
	public void setVehicleInteriorType(VehicleInteriorType vehicleInteriorType) {
		this.vehicleInteriorType = vehicleInteriorType;
	}

	public CAR(VehicleModelDate vehicleModelDate) {
		setVehicleModelDate(vehicleModelDate);
	}

	@Override
	public VehicleModelDate getVehicleModelDate() {
		return vehicleModelDate;
	}

	@Override
	public void setVehicleModelDate(VehicleModelDate vehicleModelDate) {
		this.vehicleModelDate = vehicleModelDate;
	}

	public CAR(VehicleSeatingCapacity vehicleSeatingCapacity) {
		setVehicleSeatingCapacity(vehicleSeatingCapacity);
	}

	@Override
	public VehicleSeatingCapacity getVehicleSeatingCapacity() {
		return vehicleSeatingCapacity;
	}

	@Override
	public void setVehicleSeatingCapacity(VehicleSeatingCapacity vehicleSeatingCapacity) {
		this.vehicleSeatingCapacity = vehicleSeatingCapacity;
	}

	public CAR(VehicleSpecialUsage vehicleSpecialUsage) {
		setVehicleSpecialUsage(vehicleSpecialUsage);
	}

	@Override
	public VehicleSpecialUsage getVehicleSpecialUsage() {
		return vehicleSpecialUsage;
	}

	@Override
	public void setVehicleSpecialUsage(VehicleSpecialUsage vehicleSpecialUsage) {
		this.vehicleSpecialUsage = vehicleSpecialUsage;
	}

	public CAR(VehicleTransmission vehicleTransmission) {
		setVehicleTransmission(vehicleTransmission);
	}

	@Override
	public VehicleTransmission getVehicleTransmission() {
		return vehicleTransmission;
	}

	@Override
	public void setVehicleTransmission(VehicleTransmission vehicleTransmission) {
		this.vehicleTransmission = vehicleTransmission;
	}

	public CAR(Weight weight) {
		setWeight(weight);
	}

	@Override
	public Weight getWeight() {
		return weight;
	}

	@Override
	public void setWeight(Weight weight) {
		this.weight = weight;
	}

	public CAR(WeightTotal weightTotal) {
		setWeightTotal(weightTotal);
	}

	@Override
	public WeightTotal getWeightTotal() {
		return weightTotal;
	}

	@Override
	public void setWeightTotal(WeightTotal weightTotal) {
		this.weightTotal = weightTotal;
	}

	public CAR(Wheelbase wheelbase) {
		setWheelbase(wheelbase);
	}

	@Override
	public Wheelbase getWheelbase() {
		return wheelbase;
	}

	@Override
	public void setWheelbase(Wheelbase wheelbase) {
		this.wheelbase = wheelbase;
	}

	public CAR(Width width) {
		setWidth(width);
	}

	@Override
	public Width getWidth() {
		return width;
	}

	@Override
	public void setWidth(Width width) {
		this.width = width;
	}

	public CAR(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			AccelerationTime accelerationTime,
			AcrissCode acrissCode,
			AdditionalProperty additionalProperty,
			AdditionalType additionalType,
			AggregateRating aggregateRating,
			AlternateName alternateName,
			Audience audience,
			Award award,
			BodyType bodyType,
			Brand brand,
			CargoVolume cargoVolume,
			Category category,
			Color color,
			DateVehicleFirstRegistered dateVehicleFirstRegistered,
			Depth depth,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			DriveWheelConfiguration driveWheelConfiguration,
			EmissionsCO2 emissionsCO2,
			FuelCapacity fuelCapacity,
			FuelConsumption fuelConsumption,
			FuelEfficiency fuelEfficiency,
			FuelType fuelType,
			Gtin12 gtin12,
			Gtin13 gtin13,
			Gtin14 gtin14,
			Gtin8 gtin8,
			Height height,
			Identifier identifier,
			Image image,
			IsAccessoryOrSparePartFor isAccessoryOrSparePartFor,
			IsConsumableFor isConsumableFor,
			IsRelatedTo isRelatedTo,
			IsSimilarTo isSimilarTo,
			ItemCondition itemCondition,
			KnownVehicleDamages knownVehicleDamages,
			Logo logo,
			MainEntityOfPage mainEntityOfPage,
			Manufacturer manufacturer,
			Material material,
			MeetsEmissionStandard meetsEmissionStandard,
			MileageFromOdometer mileageFromOdometer,
			Model model,
			ModelDate modelDate,
			Mpn mpn,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			NumberOfAirbags numberOfAirbags,
			NumberOfAxles numberOfAxles,
			NumberOfDoors numberOfDoors,
			NumberOfForwardGears numberOfForwardGears,
			NumberOfPreviousOwners numberOfPreviousOwners,
			Offers offers,
			Payload payload,
			PotentialAction potentialAction,
			ProductID productID,
			ProductionDate productionDate,
			PurchaseDate purchaseDate,
			ReleaseDate releaseDate,
			Review review,
			RoofLoad roofLoad,
			SameAs sameAs,
			SeatingCapacity seatingCapacity,
			Sku sku,
			Speed speed,
			SteeringPosition steeringPosition,
			TongueWeight tongueWeight,
			TrailerWeight trailerWeight,
			Url url,
			VehicleConfiguration vehicleConfiguration,
			VehicleEngine vehicleEngine,
			VehicleIdentificationNumber vehicleIdentificationNumber,
			VehicleInteriorColor vehicleInteriorColor,
			VehicleInteriorType vehicleInteriorType,
			VehicleModelDate vehicleModelDate,
			VehicleSeatingCapacity vehicleSeatingCapacity,
			VehicleSpecialUsage vehicleSpecialUsage,
			VehicleTransmission vehicleTransmission,
			Weight weight,
			WeightTotal weightTotal,
			Wheelbase wheelbase,
			Width width) {
		setSeq(seq);
		setRefSeq(refSeq);
		setRefAcr(refAcr);
		setCreatedAt(createdAt);
		setCreatedBy(createdBy);
		setUpdatedAt(updatedAt);
		setUpdatedBy(updatedBy);
		setExpiredAt(expiredAt);
		setExpiredBy(expiredBy);
		setAccelerationTime(accelerationTime);
		setAcrissCode(acrissCode);
		setAdditionalProperty(additionalProperty);
		setAdditionalType(additionalType);
		setAggregateRating(aggregateRating);
		setAlternateName(alternateName);
		setAudience(audience);
		setAward(award);
		setBodyType(bodyType);
		setBrand(brand);
		setCargoVolume(cargoVolume);
		setCategory(category);
		setColor(color);
		setDateVehicleFirstRegistered(dateVehicleFirstRegistered);
		setDepth(depth);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setDriveWheelConfiguration(driveWheelConfiguration);
		setEmissionsCO2(emissionsCO2);
		setFuelCapacity(fuelCapacity);
		setFuelConsumption(fuelConsumption);
		setFuelEfficiency(fuelEfficiency);
		setFuelType(fuelType);
		setGtin12(gtin12);
		setGtin13(gtin13);
		setGtin14(gtin14);
		setGtin8(gtin8);
		setHeight(height);
		setIdentifier(identifier);
		setImage(image);
		setIsAccessoryOrSparePartFor(isAccessoryOrSparePartFor);
		setIsConsumableFor(isConsumableFor);
		setIsRelatedTo(isRelatedTo);
		setIsSimilarTo(isSimilarTo);
		setItemCondition(itemCondition);
		setKnownVehicleDamages(knownVehicleDamages);
		setLogo(logo);
		setMainEntityOfPage(mainEntityOfPage);
		setManufacturer(manufacturer);
		setMaterial(material);
		setMeetsEmissionStandard(meetsEmissionStandard);
		setMileageFromOdometer(mileageFromOdometer);
		setModel(model);
		setModelDate(modelDate);
		setMpn(mpn);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setNumberOfAirbags(numberOfAirbags);
		setNumberOfAxles(numberOfAxles);
		setNumberOfDoors(numberOfDoors);
		setNumberOfForwardGears(numberOfForwardGears);
		setNumberOfPreviousOwners(numberOfPreviousOwners);
		setOffers(offers);
		setPayload(payload);
		setPotentialAction(potentialAction);
		setProductID(productID);
		setProductionDate(productionDate);
		setPurchaseDate(purchaseDate);
		setReleaseDate(releaseDate);
		setReview(review);
		setRoofLoad(roofLoad);
		setSameAs(sameAs);
		setSeatingCapacity(seatingCapacity);
		setSku(sku);
		setSpeed(speed);
		setSteeringPosition(steeringPosition);
		setTongueWeight(tongueWeight);
		setTrailerWeight(trailerWeight);
		setUrl(url);
		setVehicleConfiguration(vehicleConfiguration);
		setVehicleEngine(vehicleEngine);
		setVehicleIdentificationNumber(vehicleIdentificationNumber);
		setVehicleInteriorColor(vehicleInteriorColor);
		setVehicleInteriorType(vehicleInteriorType);
		setVehicleModelDate(vehicleModelDate);
		setVehicleSeatingCapacity(vehicleSeatingCapacity);
		setVehicleSpecialUsage(vehicleSpecialUsage);
		setVehicleTransmission(vehicleTransmission);
		setWeight(weight);
		setWeightTotal(weightTotal);
		setWheelbase(wheelbase);
		setWidth(width);
	}

	public void copy(Clazz.Car org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setAccelerationTime(org.getAccelerationTime());
		setAcrissCode(org.getAcrissCode());
		setAdditionalProperty(org.getAdditionalProperty());
		setAdditionalType(org.getAdditionalType());
		setAggregateRating(org.getAggregateRating());
		setAlternateName(org.getAlternateName());
		setAudience(org.getAudience());
		setAward(org.getAward());
		setBodyType(org.getBodyType());
		setBrand(org.getBrand());
		setCargoVolume(org.getCargoVolume());
		setCategory(org.getCategory());
		setColor(org.getColor());
		setDateVehicleFirstRegistered(org.getDateVehicleFirstRegistered());
		setDepth(org.getDepth());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setDriveWheelConfiguration(org.getDriveWheelConfiguration());
		setEmissionsCO2(org.getEmissionsCO2());
		setFuelCapacity(org.getFuelCapacity());
		setFuelConsumption(org.getFuelConsumption());
		setFuelEfficiency(org.getFuelEfficiency());
		setFuelType(org.getFuelType());
		setGtin12(org.getGtin12());
		setGtin13(org.getGtin13());
		setGtin14(org.getGtin14());
		setGtin8(org.getGtin8());
		setHeight(org.getHeight());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setIsAccessoryOrSparePartFor(org.getIsAccessoryOrSparePartFor());
		setIsConsumableFor(org.getIsConsumableFor());
		setIsRelatedTo(org.getIsRelatedTo());
		setIsSimilarTo(org.getIsSimilarTo());
		setItemCondition(org.getItemCondition());
		setKnownVehicleDamages(org.getKnownVehicleDamages());
		setLogo(org.getLogo());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setManufacturer(org.getManufacturer());
		setMaterial(org.getMaterial());
		setMeetsEmissionStandard(org.getMeetsEmissionStandard());
		setMileageFromOdometer(org.getMileageFromOdometer());
		setModel(org.getModel());
		setModelDate(org.getModelDate());
		setMpn(org.getMpn());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setNumberOfAirbags(org.getNumberOfAirbags());
		setNumberOfAxles(org.getNumberOfAxles());
		setNumberOfDoors(org.getNumberOfDoors());
		setNumberOfForwardGears(org.getNumberOfForwardGears());
		setNumberOfPreviousOwners(org.getNumberOfPreviousOwners());
		setOffers(org.getOffers());
		setPayload(org.getPayload());
		setPotentialAction(org.getPotentialAction());
		setProductID(org.getProductID());
		setProductionDate(org.getProductionDate());
		setPurchaseDate(org.getPurchaseDate());
		setReleaseDate(org.getReleaseDate());
		setReview(org.getReview());
		setRoofLoad(org.getRoofLoad());
		setSameAs(org.getSameAs());
		setSeatingCapacity(org.getSeatingCapacity());
		setSku(org.getSku());
		setSpeed(org.getSpeed());
		setSteeringPosition(org.getSteeringPosition());
		setTongueWeight(org.getTongueWeight());
		setTrailerWeight(org.getTrailerWeight());
		setUrl(org.getUrl());
		setVehicleConfiguration(org.getVehicleConfiguration());
		setVehicleEngine(org.getVehicleEngine());
		setVehicleIdentificationNumber(org.getVehicleIdentificationNumber());
		setVehicleInteriorColor(org.getVehicleInteriorColor());
		setVehicleInteriorType(org.getVehicleInteriorType());
		setVehicleModelDate(org.getVehicleModelDate());
		setVehicleSeatingCapacity(org.getVehicleSeatingCapacity());
		setVehicleSpecialUsage(org.getVehicleSpecialUsage());
		setVehicleTransmission(org.getVehicleTransmission());
		setWeight(org.getWeight());
		setWeightTotal(org.getWeightTotal());
		setWheelbase(org.getWheelbase());
		setWidth(org.getWidth());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public Long getSeq() {
		return seq;
	}

	@Override
	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@Override
	public Long getRefSeq() {
		return refSeq;
	}

	@Override
	public void setRefSeq(Long refSeq) {
		this.refSeq = refSeq;
	}

	@Override
	public String getRefAcr() {
		return refAcr;
	}

	@Override
	public void setRefAcr(String refAcr) {
		this.refAcr = refAcr;
	}

	@Override
	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	@Override
	public void setCreatedAt(java.util.Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public Long getCreatedBy() {
		return createdBy;
	}

	@Override
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public java.util.Date getUpdatedAt() {
		return updatedAt;
	}

	@Override
	public void setUpdatedAt(java.util.Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public Long getUpdatedBy() {
		return updatedBy;
	}

	@Override
	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public java.util.Date getExpiredAt() {
		return expiredAt;
	}

	@Override
	public void setExpiredAt(java.util.Date expiredAt) {
		this.expiredAt = expiredAt;
	}

	@Override
	public Long getExpiredBy() {
		return expiredBy;
	}

	@Override
	public void setExpiredBy(Long expiredBy) {
		this.expiredBy = expiredBy;
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
