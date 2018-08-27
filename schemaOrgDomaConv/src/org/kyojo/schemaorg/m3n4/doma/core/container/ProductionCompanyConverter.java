package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PRODUCTION_COMPANY;
import org.kyojo.schemaorg.m3n4.core.Container.ProductionCompany;

@ExternalDomain
public class ProductionCompanyConverter implements DomainConverter<ProductionCompany, String> {

	@Override
	public String fromDomainToValue(ProductionCompany domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProductionCompany fromValueToDomain(String value) {
		return new PRODUCTION_COMPANY(value);
	}

}
