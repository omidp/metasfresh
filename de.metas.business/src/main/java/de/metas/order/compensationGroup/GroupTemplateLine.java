package de.metas.order.compensationGroup;

import org.adempiere.util.Check;

import lombok.Builder;
import lombok.Value;

/*
 * #%L
 * de.metas.business
 * %%
 * Copyright (C) 2018 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

@Value
public class GroupTemplateLine
{
	int id;
	int productId;

	@Builder
	private GroupTemplateLine(final int id, final int productId)
	{
		// id is OK to be <= 0
		Check.assume(productId > 0, "productId > 0");
		
		this.id = id > 0 ? id : 0;
		this.productId = productId;
	}

}
