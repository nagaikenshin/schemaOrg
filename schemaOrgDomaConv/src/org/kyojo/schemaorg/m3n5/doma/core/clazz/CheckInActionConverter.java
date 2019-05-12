package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CHECK_IN_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.CheckInAction;

@ExternalDomain
public class CheckInActionConverter implements DomainConverter<CheckInAction, String> {

	@Override
	public String fromDomainToValue(CheckInAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public CheckInAction fromValueToDomain(String value) {
		return new CHECK_IN_ACTION(value);
	}

}
