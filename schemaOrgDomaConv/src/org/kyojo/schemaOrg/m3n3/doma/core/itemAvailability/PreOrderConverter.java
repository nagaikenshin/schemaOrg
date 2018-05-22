package org.kyojo.schemaOrg.m3n3.doma.core.itemAvailability;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.itemAvailability.PRE_ORDER;
import org.kyojo.schemaOrg.m3n3.core.ItemAvailability.PreOrder;

@ExternalDomain
public class PreOrderConverter implements DomainConverter<PreOrder, String> {

	@Override
	public String fromDomainToValue(PreOrder domain) {
		return domain.getNativeValue();
	}

	@Override
	public PreOrder fromValueToDomain(String value) {
		return new PRE_ORDER(value);
	}

}
