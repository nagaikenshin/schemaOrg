package org.kyojo.schemaOrg.m3n3.auto.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.auto.Clazz;
import org.kyojo.schemaOrg.m3n3.auto.Container.AccelerationTime;
import org.kyojo.schemaOrg.m3n3.auto.Container.BodyType;
import org.kyojo.schemaOrg.m3n3.auto.Container.EmissionsCO2;
import org.kyojo.schemaOrg.m3n3.auto.Container.FuelCapacity;
import org.kyojo.schemaOrg.m3n3.auto.Container.MeetsEmissionStandard;
import org.kyojo.schemaOrg.m3n3.auto.Container.ModelDate;
import org.kyojo.schemaOrg.m3n3.auto.Container.Payload;
import org.kyojo.schemaOrg.m3n3.auto.Container.SeatingCapacity;
import org.kyojo.schemaOrg.m3n3.auto.Container.Speed;
import org.kyojo.schemaOrg.m3n3.auto.Container.TongueWeight;
import org.kyojo.schemaOrg.m3n3.auto.Container.TrailerWeight;
import org.kyojo.schemaOrg.m3n3.auto.Container.VehicleSpecialUsage;
import org.kyojo.schemaOrg.m3n3.auto.Container.WeightTotal;
import org.kyojo.schemaOrg.m3n3.auto.Container.Wheelbase;
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

public class MOTORCYCLE implements Clazz.Motorcycle {

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

	public MOTORCYCLE() {
	}

	public MOTORCYCLE(Long seq) {
		setSeq(seq);
	}

	public MOTORCYCLE(String string) {
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

	public MOTORCYCLE(AccelerationTime accelerationTime) {
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

	public MOTORCYCLE(AdditionalProperty additionalProperty) {
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

	public MOTORCYCLE(AdditionalType additionalType) {
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

	public MOTORCYCLE(AggregateRating aggregateRating) {
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

	public MOTORCYCLE(AlternateName alternateName) {
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

	public MOTORCYCLE(Audience audience) {
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

	public MOTORCYCLE(Award award) {
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

	public MOTORCYCLE(BodyType bodyType) {
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

	public MOTORCYCLE(Brand brand) {
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

	public MOTORCYCLE(CargoVolume cargoVolume) {
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

	public MOTORCYCLE(Category category) {
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

	public MOTORCYCLE(Color color) {
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

	public MOTORCYCLE(DateVehicleFirstRegistered dateVehicleFirstRegistered) {
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

	public MOTORCYCLE(Depth depth) {
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

	public MOTORCYCLE(Description description) {
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

	public MOTORCYCLE(DisambiguatingDescription disambiguatingDescription) {
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

	public MOTORCYCLE(DriveWheelConfiguration driveWheelConfiguration) {
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

	public MOTORCYCLE(EmissionsCO2 emissionsCO2) {
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

	public MOTORCYCLE(FuelCapacity fuelCapacity) {
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

	public MOTORCYCLE(FuelConsumption fuelConsumption) {
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

	public MOTORCYCLE(FuelEfficiency fuelEfficiency) {
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

	public MOTORCYCLE(FuelType fuelType) {
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

	public MOTORCYCLE(Gtin12 gtin12) {
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

	public MOTORCYCLE(Gtin13 gtin13) {
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

	public MOTORCYCLE(Gtin14 gtin14) {
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

	public MOTORCYCLE(Gtin8 gtin8) {
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

	public MOTORCYCLE(Height height) {
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

	public MOTORCYCLE(Identifier identifier) {
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

	public MOTORCYCLE(Image image) {
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

	public MOTORCYCLE(IsAccessoryOrSparePartFor isAccessoryOrSparePartFor) {
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

	public MOTORCYCLE(IsConsumableFor isConsumableFor) {
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

	public MOTORCYCLE(IsRelatedTo isRelatedTo) {
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

	public MOTORCYCLE(IsSimilarTo isSimilarTo) {
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

	public MOTORCYCLE(ItemCondition itemCondition) {
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

	public MOTORCYCLE(KnownVehicleDamages knownVehicleDamages) {
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

	public MOTORCYCLE(Logo logo) {
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

	public MOTORCYCLE(MainEntityOfPage mainEntityOfPage) {
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

	public MOTORCYCLE(Manufacturer manufacturer) {
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

	public MOTORCYCLE(Material material) {
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

	public MOTORCYCLE(MeetsEmissionStandard meetsEmissionStandard) {
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

	public MOTORCYCLE(MileageFromOdometer mileageFromOdometer) {
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

	public MOTORCYCLE(Model model) {
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

	public MOTORCYCLE(ModelDate modelDate) {
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

	public MOTORCYCLE(Mpn mpn) {
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

	public MOTORCYCLE(Name name) {
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

	public MOTORCYCLE(NameFuzzy nameFuzzy) {
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

	public MOTORCYCLE(NameRuby nameRuby) {
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

	public MOTORCYCLE(NumberOfAirbags numberOfAirbags) {
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

	public MOTORCYCLE(NumberOfAxles numberOfAxles) {
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

	public MOTORCYCLE(NumberOfDoors numberOfDoors) {
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

	public MOTORCYCLE(NumberOfForwardGears numberOfForwardGears) {
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

	public MOTORCYCLE(NumberOfPreviousOwners numberOfPreviousOwners) {
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

	public MOTORCYCLE(Offers offers) {
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

	public MOTORCYCLE(Payload payload) {
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

	public MOTORCYCLE(PotentialAction potentialAction) {
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

	public MOTORCYCLE(ProductID productID) {
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

	public MOTORCYCLE(ProductionDate productionDate) {
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

	public MOTORCYCLE(PurchaseDate purchaseDate) {
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

	public MOTORCYCLE(ReleaseDate releaseDate) {
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

	public MOTORCYCLE(Review review) {
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

	public MOTORCYCLE(SameAs sameAs) {
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

	public MOTORCYCLE(SeatingCapacity seatingCapacity) {
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

	public MOTORCYCLE(Sku sku) {
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

	public MOTORCYCLE(Speed speed) {
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

	public MOTORCYCLE(SteeringPosition steeringPosition) {
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

	public MOTORCYCLE(TongueWeight tongueWeight) {
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

	public MOTORCYCLE(TrailerWeight trailerWeight) {
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

	public MOTORCYCLE(Url url) {
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

	public MOTORCYCLE(VehicleConfiguration vehicleConfiguration) {
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

	public MOTORCYCLE(VehicleEngine vehicleEngine) {
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

	public MOTORCYCLE(VehicleIdentificationNumber vehicleIdentificationNumber) {
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

	public MOTORCYCLE(VehicleInteriorColor vehicleInteriorColor) {
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

	public MOTORCYCLE(VehicleInteriorType vehicleInteriorType) {
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

	public MOTORCYCLE(VehicleModelDate vehicleModelDate) {
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

	public MOTORCYCLE(VehicleSeatingCapacity vehicleSeatingCapacity) {
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

	public MOTORCYCLE(VehicleSpecialUsage vehicleSpecialUsage) {
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

	public MOTORCYCLE(VehicleTransmission vehicleTransmission) {
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

	public MOTORCYCLE(Weight weight) {
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

	public MOTORCYCLE(WeightTotal weightTotal) {
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

	public MOTORCYCLE(Wheelbase wheelbase) {
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

	public MOTORCYCLE(Width width) {
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

	public MOTORCYCLE(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			AccelerationTime accelerationTime,
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

	public void copy(Clazz.Motorcycle org) {
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
