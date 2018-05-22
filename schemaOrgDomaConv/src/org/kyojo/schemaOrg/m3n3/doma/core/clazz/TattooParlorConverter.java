package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TATTOO_PARLOR;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TattooParlor;

@ExternalDomain
public class TattooParlorConverter implements DomainConverter<TattooParlor, String> {

	@Override
	public String fromDomainToValue(TattooParlor domain) {
		return domain.getNativeValue();
	}

	@Override
	public TattooParlor fromValueToDomain(String value) {
		return new TATTOO_PARLOR(value);
	}

}
