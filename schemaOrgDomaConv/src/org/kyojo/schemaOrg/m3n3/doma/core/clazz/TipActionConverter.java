package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TIP_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TipAction;

@ExternalDomain
public class TipActionConverter implements DomainConverter<TipAction, String> {

	@Override
	public String fromDomainToValue(TipAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public TipAction fromValueToDomain(String value) {
		return new TIP_ACTION(value);
	}

}
