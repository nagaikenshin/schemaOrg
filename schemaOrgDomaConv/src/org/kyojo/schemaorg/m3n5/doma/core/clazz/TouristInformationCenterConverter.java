package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TOURIST_INFORMATION_CENTER;
import org.kyojo.schemaorg.m3n5.core.Clazz.TouristInformationCenter;

@ExternalDomain
public class TouristInformationCenterConverter implements DomainConverter<TouristInformationCenter, String> {

	@Override
	public String fromDomainToValue(TouristInformationCenter domain) {
		return domain.getNativeValue();
	}

	@Override
	public TouristInformationCenter fromValueToDomain(String value) {
		return new TOURIST_INFORMATION_CENTER(value);
	}

}
