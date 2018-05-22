package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PRODUCTION_COMPANY;
import org.kyojo.schemaOrg.m3n3.core.Container.ProductionCompany;

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
