package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz;
import org.kyojo.schemaorg.m3n3.core.Container.AdditionalProperty;
import org.kyojo.schemaorg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n3.core.Container.AggregateRating;
import org.kyojo.schemaorg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n3.core.Container.Audience;
import org.kyojo.schemaorg.m3n3.core.Container.Award;
import org.kyojo.schemaorg.m3n3.core.Container.Brand;
import org.kyojo.schemaorg.m3n3.core.Container.Category;
import org.kyojo.schemaorg.m3n3.core.Container.Color;
import org.kyojo.schemaorg.m3n3.core.Container.Depth;
import org.kyojo.schemaorg.m3n3.core.Container.Description;
import org.kyojo.schemaorg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n3.core.Container.Gtin12;
import org.kyojo.schemaorg.m3n3.core.Container.Gtin13;
import org.kyojo.schemaorg.m3n3.core.Container.Gtin14;
import org.kyojo.schemaorg.m3n3.core.Container.Gtin8;
import org.kyojo.schemaorg.m3n3.core.Container.Height;
import org.kyojo.schemaorg.m3n3.core.Container.Identifier;
import org.kyojo.schemaorg.m3n3.core.Container.Image;
import org.kyojo.schemaorg.m3n3.core.Container.IsAccessoryOrSparePartFor;
import org.kyojo.schemaorg.m3n3.core.Container.IsConsumableFor;
import org.kyojo.schemaorg.m3n3.core.Container.IsRelatedTo;
import org.kyojo.schemaorg.m3n3.core.Container.IsSimilarTo;
import org.kyojo.schemaorg.m3n3.core.Container.IsVariantOf;
import org.kyojo.schemaorg.m3n3.core.Container.ItemCondition;
import org.kyojo.schemaorg.m3n3.core.Container.Logo;
import org.kyojo.schemaorg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n3.core.Container.Manufacturer;
import org.kyojo.schemaorg.m3n3.core.Container.Material;
import org.kyojo.schemaorg.m3n3.core.Container.Model;
import org.kyojo.schemaorg.m3n3.core.Container.Mpn;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n3.core.Container.Offers;
import org.kyojo.schemaorg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n3.core.Container.PredecessorOf;
import org.kyojo.schemaorg.m3n3.core.Container.ProductID;
import org.kyojo.schemaorg.m3n3.core.Container.ProductionDate;
import org.kyojo.schemaorg.m3n3.core.Container.PurchaseDate;
import org.kyojo.schemaorg.m3n3.core.Container.ReleaseDate;
import org.kyojo.schemaorg.m3n3.core.Container.Review;
import org.kyojo.schemaorg.m3n3.core.Container.SameAs;
import org.kyojo.schemaorg.m3n3.core.Container.Sku;
import org.kyojo.schemaorg.m3n3.core.Container.SuccessorOf;
import org.kyojo.schemaorg.m3n3.core.Container.Url;
import org.kyojo.schemaorg.m3n3.core.Container.Weight;
import org.kyojo.schemaorg.m3n3.core.Container.Width;
import org.kyojo.schemaorg.m3n3.core.DataType;
import org.kyojo.schemaorg.m3n3.core.impl.NAME;
import org.kyojo.schemaorg.m3n3.core.impl.TEXT;

public class PRODUCT_MODEL implements Clazz.ProductModel {

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
	public AdditionalProperty additionalProperty;
	public AdditionalType additionalType;
	public AggregateRating aggregateRating;
	public AlternateName alternateName;
	public Audience audience;
	public Award award;
	public Brand brand;
	public Category category;
	public Color color;
	public Depth depth;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
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
	public IsVariantOf isVariantOf;
	public ItemCondition itemCondition;
	public Logo logo;
	public MainEntityOfPage mainEntityOfPage;
	public Manufacturer manufacturer;
	public Material material;
	public Model model;
	public Mpn mpn;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public Offers offers;
	public PotentialAction potentialAction;
	public PredecessorOf predecessorOf;
	public ProductID productID;
	public ProductionDate productionDate;
	public PurchaseDate purchaseDate;
	public ReleaseDate releaseDate;
	public Review review;
	public SameAs sameAs;
	public Sku sku;
	public SuccessorOf successorOf;
	public Url url;
	public Weight weight;
	public Width width;

	public PRODUCT_MODEL() {
	}

	public PRODUCT_MODEL(Long seq) {
		setSeq(seq);
	}

	public PRODUCT_MODEL(String string) {
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

	public PRODUCT_MODEL(AdditionalProperty additionalProperty) {
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

	public PRODUCT_MODEL(AdditionalType additionalType) {
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

	public PRODUCT_MODEL(AggregateRating aggregateRating) {
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

	public PRODUCT_MODEL(AlternateName alternateName) {
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

	public PRODUCT_MODEL(Audience audience) {
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

	public PRODUCT_MODEL(Award award) {
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

	public PRODUCT_MODEL(Brand brand) {
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

	public PRODUCT_MODEL(Category category) {
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

	public PRODUCT_MODEL(Color color) {
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

	public PRODUCT_MODEL(Depth depth) {
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

	public PRODUCT_MODEL(Description description) {
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

	public PRODUCT_MODEL(DisambiguatingDescription disambiguatingDescription) {
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

	public PRODUCT_MODEL(Gtin12 gtin12) {
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

	public PRODUCT_MODEL(Gtin13 gtin13) {
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

	public PRODUCT_MODEL(Gtin14 gtin14) {
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

	public PRODUCT_MODEL(Gtin8 gtin8) {
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

	public PRODUCT_MODEL(Height height) {
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

	public PRODUCT_MODEL(Identifier identifier) {
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

	public PRODUCT_MODEL(Image image) {
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

	public PRODUCT_MODEL(IsAccessoryOrSparePartFor isAccessoryOrSparePartFor) {
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

	public PRODUCT_MODEL(IsConsumableFor isConsumableFor) {
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

	public PRODUCT_MODEL(IsRelatedTo isRelatedTo) {
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

	public PRODUCT_MODEL(IsSimilarTo isSimilarTo) {
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

	public PRODUCT_MODEL(IsVariantOf isVariantOf) {
		setIsVariantOf(isVariantOf);
	}

	@Override
	public IsVariantOf getIsVariantOf() {
		return isVariantOf;
	}

	@Override
	public void setIsVariantOf(IsVariantOf isVariantOf) {
		this.isVariantOf = isVariantOf;
	}

	public PRODUCT_MODEL(ItemCondition itemCondition) {
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

	public PRODUCT_MODEL(Logo logo) {
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

	public PRODUCT_MODEL(MainEntityOfPage mainEntityOfPage) {
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

	public PRODUCT_MODEL(Manufacturer manufacturer) {
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

	public PRODUCT_MODEL(Material material) {
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

	public PRODUCT_MODEL(Model model) {
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

	public PRODUCT_MODEL(Mpn mpn) {
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

	public PRODUCT_MODEL(Name name) {
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

	public PRODUCT_MODEL(NameFuzzy nameFuzzy) {
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

	public PRODUCT_MODEL(NameRuby nameRuby) {
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

	public PRODUCT_MODEL(Offers offers) {
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

	public PRODUCT_MODEL(PotentialAction potentialAction) {
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

	public PRODUCT_MODEL(PredecessorOf predecessorOf) {
		setPredecessorOf(predecessorOf);
	}

	@Override
	public PredecessorOf getPredecessorOf() {
		return predecessorOf;
	}

	@Override
	public void setPredecessorOf(PredecessorOf predecessorOf) {
		this.predecessorOf = predecessorOf;
	}

	public PRODUCT_MODEL(ProductID productID) {
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

	public PRODUCT_MODEL(ProductionDate productionDate) {
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

	public PRODUCT_MODEL(PurchaseDate purchaseDate) {
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

	public PRODUCT_MODEL(ReleaseDate releaseDate) {
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

	public PRODUCT_MODEL(Review review) {
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

	public PRODUCT_MODEL(SameAs sameAs) {
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

	public PRODUCT_MODEL(Sku sku) {
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

	public PRODUCT_MODEL(SuccessorOf successorOf) {
		setSuccessorOf(successorOf);
	}

	@Override
	public SuccessorOf getSuccessorOf() {
		return successorOf;
	}

	@Override
	public void setSuccessorOf(SuccessorOf successorOf) {
		this.successorOf = successorOf;
	}

	public PRODUCT_MODEL(Url url) {
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

	public PRODUCT_MODEL(Weight weight) {
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

	public PRODUCT_MODEL(Width width) {
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

	public PRODUCT_MODEL(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			AdditionalProperty additionalProperty,
			AdditionalType additionalType,
			AggregateRating aggregateRating,
			AlternateName alternateName,
			Audience audience,
			Award award,
			Brand brand,
			Category category,
			Color color,
			Depth depth,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
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
			IsVariantOf isVariantOf,
			ItemCondition itemCondition,
			Logo logo,
			MainEntityOfPage mainEntityOfPage,
			Manufacturer manufacturer,
			Material material,
			Model model,
			Mpn mpn,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			Offers offers,
			PotentialAction potentialAction,
			PredecessorOf predecessorOf,
			ProductID productID,
			ProductionDate productionDate,
			PurchaseDate purchaseDate,
			ReleaseDate releaseDate,
			Review review,
			SameAs sameAs,
			Sku sku,
			SuccessorOf successorOf,
			Url url,
			Weight weight,
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
		setAdditionalProperty(additionalProperty);
		setAdditionalType(additionalType);
		setAggregateRating(aggregateRating);
		setAlternateName(alternateName);
		setAudience(audience);
		setAward(award);
		setBrand(brand);
		setCategory(category);
		setColor(color);
		setDepth(depth);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
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
		setIsVariantOf(isVariantOf);
		setItemCondition(itemCondition);
		setLogo(logo);
		setMainEntityOfPage(mainEntityOfPage);
		setManufacturer(manufacturer);
		setMaterial(material);
		setModel(model);
		setMpn(mpn);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setOffers(offers);
		setPotentialAction(potentialAction);
		setPredecessorOf(predecessorOf);
		setProductID(productID);
		setProductionDate(productionDate);
		setPurchaseDate(purchaseDate);
		setReleaseDate(releaseDate);
		setReview(review);
		setSameAs(sameAs);
		setSku(sku);
		setSuccessorOf(successorOf);
		setUrl(url);
		setWeight(weight);
		setWidth(width);
	}

	public void copy(Clazz.ProductModel org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setAdditionalProperty(org.getAdditionalProperty());
		setAdditionalType(org.getAdditionalType());
		setAggregateRating(org.getAggregateRating());
		setAlternateName(org.getAlternateName());
		setAudience(org.getAudience());
		setAward(org.getAward());
		setBrand(org.getBrand());
		setCategory(org.getCategory());
		setColor(org.getColor());
		setDepth(org.getDepth());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
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
		setIsVariantOf(org.getIsVariantOf());
		setItemCondition(org.getItemCondition());
		setLogo(org.getLogo());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setManufacturer(org.getManufacturer());
		setMaterial(org.getMaterial());
		setModel(org.getModel());
		setMpn(org.getMpn());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setOffers(org.getOffers());
		setPotentialAction(org.getPotentialAction());
		setPredecessorOf(org.getPredecessorOf());
		setProductID(org.getProductID());
		setProductionDate(org.getProductionDate());
		setPurchaseDate(org.getPurchaseDate());
		setReleaseDate(org.getReleaseDate());
		setReview(org.getReview());
		setSameAs(org.getSameAs());
		setSku(org.getSku());
		setSuccessorOf(org.getSuccessorOf());
		setUrl(org.getUrl());
		setWeight(org.getWeight());
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
