package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INDIVIDUAL_PRODUCT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.IndividualProduct;

@ExternalDomain
public class IndividualProductConverter implements DomainConverter<IndividualProduct, String> {

	@Override
	public String fromDomainToValue(IndividualProduct domain) {
		return domain.getNativeValue();
	}

	@Override
	public IndividualProduct fromValueToDomain(String value) {
		return new INDIVIDUAL_PRODUCT(value);
	}

}
