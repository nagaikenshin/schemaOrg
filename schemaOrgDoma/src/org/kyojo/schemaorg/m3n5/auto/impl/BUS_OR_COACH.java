package org.kyojo.schemaorg.m3n5.auto.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.auto.Clazz;
import org.kyojo.schemaorg.m3n5.auto.Container.AccelerationTime;
import org.kyojo.schemaorg.m3n5.auto.Container.AcrissCode;
import org.kyojo.schemaorg.m3n5.auto.Container.BodyType;
import org.kyojo.schemaorg.m3n5.auto.Container.EmissionsCO2;
import org.kyojo.schemaorg.m3n5.auto.Container.FuelCapacity;
import org.kyojo.schemaorg.m3n5.auto.Container.MeetsEmissionStandard;
import org.kyojo.schemaorg.m3n5.auto.Container.ModelDate;
import org.kyojo.schemaorg.m3n5.auto.Container.Payload;
import org.kyojo.schemaorg.m3n5.auto.Container.RoofLoad;
import org.kyojo.schemaorg.m3n5.auto.Container.SeatingCapacity;
import org.kyojo.schemaorg.m3n5.auto.Container.Speed;
import org.kyojo.schemaorg.m3n5.auto.Container.TongueWeight;
import org.kyojo.schemaorg.m3n5.auto.Container.TrailerWeight;
import org.kyojo.schemaorg.m3n5.auto.Container.VehicleSpecialUsage;
import org.kyojo.schemaorg.m3n5.auto.Container.WeightTotal;
import org.kyojo.schemaorg.m3n5.auto.Container.Wheelbase;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalProperty;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n5.core.Container.AggregateRating;
import org.kyojo.schemaorg.m3n5.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n5.core.Container.Audience;
import org.kyojo.schemaorg.m3n5.core.Container.Award;
import org.kyojo.schemaorg.m3n5.core.Container.Brand;
import org.kyojo.schemaorg.m3n5.core.Container.CargoVolume;
import org.kyojo.schemaorg.m3n5.core.Container.Category;
import org.kyojo.schemaorg.m3n5.core.Container.Color;
import org.kyojo.schemaorg.m3n5.core.Container.DateVehicleFirstRegistered;
import org.kyojo.schemaorg.m3n5.core.Container.Depth;
import org.kyojo.schemaorg.m3n5.core.Container.Description;
import org.kyojo.schemaorg.m3n5.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n5.core.Container.DriveWheelConfiguration;
import org.kyojo.schemaorg.m3n5.core.Container.FuelConsumption;
import org.kyojo.schemaorg.m3n5.core.Container.FuelEfficiency;
import org.kyojo.schemaorg.m3n5.core.Container.FuelType;
import org.kyojo.schemaorg.m3n5.core.Container.Gtin12;
import org.kyojo.schemaorg.m3n5.core.Container.Gtin13;
import org.kyojo.schemaorg.m3n5.core.Container.Gtin14;
import org.kyojo.schemaorg.m3n5.core.Container.Gtin8;
import org.kyojo.schemaorg.m3n5.core.Container.Height;
import org.kyojo.schemaorg.m3n5.core.Container.Identifier;
import org.kyojo.schemaorg.m3n5.core.Container.Image;
import org.kyojo.schemaorg.m3n5.core.Container.IsAccessoryOrSparePartFor;
import org.kyojo.schemaorg.m3n5.core.Container.IsConsumableFor;
import org.kyojo.schemaorg.m3n5.core.Container.IsRelatedTo;
import org.kyojo.schemaorg.m3n5.core.Container.IsSimilarTo;
import org.kyojo.schemaorg.m3n5.core.Container.ItemCondition;
import org.kyojo.schemaorg.m3n5.core.Container.KnownVehicleDamages;
import org.kyojo.schemaorg.m3n5.core.Container.Logo;
import org.kyojo.schemaorg.m3n5.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n5.core.Container.Manufacturer;
import org.kyojo.schemaorg.m3n5.core.Container.Material;
import org.kyojo.schemaorg.m3n5.core.Container.MileageFromOdometer;
import org.kyojo.schemaorg.m3n5.core.Container.Model;
import org.kyojo.schemaorg.m3n5.core.Container.Mpn;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n5.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n5.core.Container.NumberOfAirbags;
import org.kyojo.schemaorg.m3n5.core.Container.NumberOfAxles;
import org.kyojo.schemaorg.m3n5.core.Container.NumberOfDoors;
import org.kyojo.schemaorg.m3n5.core.Container.NumberOfForwardGears;
import org.kyojo.schemaorg.m3n5.core.Container.NumberOfPreviousOwners;
import org.kyojo.schemaorg.m3n5.core.Container.Offers;
import org.kyojo.schemaorg.m3n5.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n5.core.Container.ProductID;
import org.kyojo.schemaorg.m3n5.core.Container.ProductionDate;
import org.kyojo.schemaorg.m3n5.core.Container.PurchaseDate;
import org.kyojo.schemaorg.m3n5.core.Container.ReleaseDate;
import org.kyojo.schemaorg.m3n5.core.Container.Review;
import org.kyojo.schemaorg.m3n5.core.Container.SameAs;
import org.kyojo.schemaorg.m3n5.core.Container.Sku;
import org.kyojo.schemaorg.m3n5.core.Container.Slogan;
import org.kyojo.schemaorg.m3n5.core.Container.SteeringPosition;
import org.kyojo.schemaorg.m3n5.core.Container.SubjectOf;
import org.kyojo.schemaorg.m3n5.core.Container.Url;
import org.kyojo.schemaorg.m3n5.core.Container.VehicleConfiguration;
import org.kyojo.schemaorg.m3n5.core.Container.VehicleEngine;
import org.kyojo.schemaorg.m3n5.core.Container.VehicleIdentificationNumber;
import org.kyojo.schemaorg.m3n5.core.Container.VehicleInteriorColor;
import org.kyojo.schemaorg.m3n5.core.Container.VehicleInteriorType;
import org.kyojo.schemaorg.m3n5.core.Container.VehicleModelDate;
import org.kyojo.schemaorg.m3n5.core.Container.VehicleSeatingCapacity;
import org.kyojo.schemaorg.m3n5.core.Container.VehicleTransmission;
import org.kyojo.schemaorg.m3n5.core.Container.Weight;
import org.kyojo.schemaorg.m3n5.core.Container.Width;
import org.kyojo.schemaorg.m3n5.core.DataType;
import org.kyojo.schemaorg.m3n5.core.impl.NAME;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;
import org.kyojo.schemaorg.m3n5.pending.Container.Nsn;


public class BUS_OR_COACH implements Clazz.BusOrCoach {

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
	public Nsn nsn;
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
	public Slogan slogan;
	public Speed speed;
	public SteeringPosition steeringPosition;
	public SubjectOf subjectOf;
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

	public BUS_OR_COACH() {
	}

	public BUS_OR_COACH(Long seq) {
		setSeq(seq);
	}

	public BUS_OR_COACH(String string) {
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

	public BUS_OR_COACH(AccelerationTime accelerationTime) {
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

	public BUS_OR_COACH(AcrissCode acrissCode) {
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

	public BUS_OR_COACH(AdditionalProperty additionalProperty) {
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

	public BUS_OR_COACH(AdditionalType additionalType) {
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

	public BUS_OR_COACH(AggregateRating aggregateRating) {
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

	public BUS_OR_COACH(AlternateName alternateName) {
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

	public BUS_OR_COACH(Audience audience) {
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

	public BUS_OR_COACH(Award award) {
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

	public BUS_OR_COACH(BodyType bodyType) {
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

	public BUS_OR_COACH(Brand brand) {
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

	public BUS_OR_COACH(CargoVolume cargoVolume) {
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

	public BUS_OR_COACH(Category category) {
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

	public BUS_OR_COACH(Color color) {
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

	public BUS_OR_COACH(DateVehicleFirstRegistered dateVehicleFirstRegistered) {
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

	public BUS_OR_COACH(Depth depth) {
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

	public BUS_OR_COACH(Description description) {
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

	public BUS_OR_COACH(DisambiguatingDescription disambiguatingDescription) {
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

	public BUS_OR_COACH(DriveWheelConfiguration driveWheelConfiguration) {
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

	public BUS_OR_COACH(EmissionsCO2 emissionsCO2) {
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

	public BUS_OR_COACH(FuelCapacity fuelCapacity) {
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

	public BUS_OR_COACH(FuelConsumption fuelConsumption) {
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

	public BUS_OR_COACH(FuelEfficiency fuelEfficiency) {
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

	public BUS_OR_COACH(FuelType fuelType) {
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

	public BUS_OR_COACH(Gtin12 gtin12) {
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

	public BUS_OR_COACH(Gtin13 gtin13) {
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

	public BUS_OR_COACH(Gtin14 gtin14) {
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

	public BUS_OR_COACH(Gtin8 gtin8) {
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

	public BUS_OR_COACH(Height height) {
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

	public BUS_OR_COACH(Identifier identifier) {
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

	public BUS_OR_COACH(Image image) {
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

	public BUS_OR_COACH(IsAccessoryOrSparePartFor isAccessoryOrSparePartFor) {
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

	public BUS_OR_COACH(IsConsumableFor isConsumableFor) {
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

	public BUS_OR_COACH(IsRelatedTo isRelatedTo) {
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

	public BUS_OR_COACH(IsSimilarTo isSimilarTo) {
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

	public BUS_OR_COACH(ItemCondition itemCondition) {
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

	public BUS_OR_COACH(KnownVehicleDamages knownVehicleDamages) {
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

	public BUS_OR_COACH(Logo logo) {
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

	public BUS_OR_COACH(MainEntityOfPage mainEntityOfPage) {
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

	public BUS_OR_COACH(Manufacturer manufacturer) {
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

	public BUS_OR_COACH(Material material) {
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

	public BUS_OR_COACH(MeetsEmissionStandard meetsEmissionStandard) {
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

	public BUS_OR_COACH(MileageFromOdometer mileageFromOdometer) {
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

	public BUS_OR_COACH(Model model) {
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

	public BUS_OR_COACH(ModelDate modelDate) {
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

	public BUS_OR_COACH(Mpn mpn) {
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

	public BUS_OR_COACH(Name name) {
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

	public BUS_OR_COACH(NameFuzzy nameFuzzy) {
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

	public BUS_OR_COACH(NameRuby nameRuby) {
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

	public BUS_OR_COACH(Nsn nsn) {
		setNsn(nsn);
	}

	@Override
	public Nsn getNsn() {
		return nsn;
	}

	@Override
	public void setNsn(Nsn nsn) {
		this.nsn = nsn;
	}

	public BUS_OR_COACH(NumberOfAirbags numberOfAirbags) {
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

	public BUS_OR_COACH(NumberOfAxles numberOfAxles) {
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

	public BUS_OR_COACH(NumberOfDoors numberOfDoors) {
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

	public BUS_OR_COACH(NumberOfForwardGears numberOfForwardGears) {
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

	public BUS_OR_COACH(NumberOfPreviousOwners numberOfPreviousOwners) {
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

	public BUS_OR_COACH(Offers offers) {
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

	public BUS_OR_COACH(Payload payload) {
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

	public BUS_OR_COACH(PotentialAction potentialAction) {
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

	public BUS_OR_COACH(ProductID productID) {
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

	public BUS_OR_COACH(ProductionDate productionDate) {
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

	public BUS_OR_COACH(PurchaseDate purchaseDate) {
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

	public BUS_OR_COACH(ReleaseDate releaseDate) {
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

	public BUS_OR_COACH(Review review) {
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

	public BUS_OR_COACH(RoofLoad roofLoad) {
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

	public BUS_OR_COACH(SameAs sameAs) {
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

	public BUS_OR_COACH(SeatingCapacity seatingCapacity) {
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

	public BUS_OR_COACH(Sku sku) {
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

	public BUS_OR_COACH(Slogan slogan) {
		setSlogan(slogan);
	}

	@Override
	public Slogan getSlogan() {
		return slogan;
	}

	@Override
	public void setSlogan(Slogan slogan) {
		this.slogan = slogan;
	}

	public BUS_OR_COACH(Speed speed) {
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

	public BUS_OR_COACH(SteeringPosition steeringPosition) {
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

	public BUS_OR_COACH(SubjectOf subjectOf) {
		setSubjectOf(subjectOf);
	}

	@Override
	public SubjectOf getSubjectOf() {
		return subjectOf;
	}

	@Override
	public void setSubjectOf(SubjectOf subjectOf) {
		this.subjectOf = subjectOf;
	}

	public BUS_OR_COACH(TongueWeight tongueWeight) {
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

	public BUS_OR_COACH(TrailerWeight trailerWeight) {
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

	public BUS_OR_COACH(Url url) {
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

	public BUS_OR_COACH(VehicleConfiguration vehicleConfiguration) {
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

	public BUS_OR_COACH(VehicleEngine vehicleEngine) {
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

	public BUS_OR_COACH(VehicleIdentificationNumber vehicleIdentificationNumber) {
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

	public BUS_OR_COACH(VehicleInteriorColor vehicleInteriorColor) {
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

	public BUS_OR_COACH(VehicleInteriorType vehicleInteriorType) {
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

	public BUS_OR_COACH(VehicleModelDate vehicleModelDate) {
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

	public BUS_OR_COACH(VehicleSeatingCapacity vehicleSeatingCapacity) {
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

	public BUS_OR_COACH(VehicleSpecialUsage vehicleSpecialUsage) {
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

	public BUS_OR_COACH(VehicleTransmission vehicleTransmission) {
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

	public BUS_OR_COACH(Weight weight) {
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

	public BUS_OR_COACH(WeightTotal weightTotal) {
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

	public BUS_OR_COACH(Wheelbase wheelbase) {
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

	public BUS_OR_COACH(Width width) {
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

	public void copy(Clazz.BusOrCoach org) {
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
		setNsn(org.getNsn());
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
		setSlogan(org.getSlogan());
		setSpeed(org.getSpeed());
		setSteeringPosition(org.getSteeringPosition());
		setSubjectOf(org.getSubjectOf());
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
