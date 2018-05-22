package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TIE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TieAction;

@ExternalDomain
public class TieActionConverter implements DomainConverter<TieAction, String> {

	@Override
	public String fromDomainToValue(TieAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public TieAction fromValueToDomain(String value) {
		return new TIE_ACTION(value);
	}

}
