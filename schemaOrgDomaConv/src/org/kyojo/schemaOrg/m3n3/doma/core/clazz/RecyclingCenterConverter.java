package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RECYCLING_CENTER;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RecyclingCenter;

@ExternalDomain
public class RecyclingCenterConverter implements DomainConverter<RecyclingCenter, String> {

	@Override
	public String fromDomainToValue(RecyclingCenter domain) {
		return domain.getNativeValue();
	}

	@Override
	public RecyclingCenter fromValueToDomain(String value) {
		return new RECYCLING_CENTER(value);
	}

}
